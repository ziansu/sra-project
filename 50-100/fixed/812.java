private void markDropArea(int itemIndex) {
    if ((((mDraggedEntry) != null) && (isIndexInBound(mDragEnteredEntryIndex))) && (isIndexInBound(itemIndex))) {
        mDataSetChangedListener.cacheOffsetsForDatasetChange();
        final int oldIndex = mDragEnteredEntryIndex;
        mContactEntries.remove(mDragEnteredEntryIndex);
        mDragEnteredEntryIndex = itemIndex;
        mContactEntries.add(mDragEnteredEntryIndex, ContactEntry.BLANK_ENTRY);
        ContactEntry.BLANK_ENTRY.id = mDraggedEntry.id;
        mDataSetChangedListener.onDataSetChangedForAnimation();
        notifyDataSetChanged();
    }
}
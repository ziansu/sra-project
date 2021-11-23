public final void moveItem(T item, int toPosition) {
    int fromPosition = mItems.indexOf(item);
    java.util.Collections.swap(mItems, fromPosition, toPosition);
    com.github.gfranks.dynamiccard.adapter.DynamicCardAdapter.notifyItemMoved(fromPosition, toPosition);
    if ((mCallback) != null) {
        mCallback.onDynamicCardPositionChanged(this, fromPosition, toPosition);
    }
}
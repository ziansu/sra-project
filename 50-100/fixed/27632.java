private void updateListHeader(com.eleybourn.bookcatalogue.BooksOnBookshelf.ListViewHolder holder, int topItem, boolean hasLevel1, boolean hasLevel2) {
    if (topItem < 0)
        topItem = 0;
    
    mLastTop = topItem;
    if (hasLevel1) {
        mList.moveToPosition(topItem);
        holder.level1Text.setText(mList.getRowView().getLevel1Data());
        java.lang.String s = null;
        if (hasLevel2) {
            s = mList.getRowView().getLevel2Data();
            holder.level2Text.setText(s);
        }
    }
}
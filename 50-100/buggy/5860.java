@java.lang.Override
public int getItemViewType(int position) {
    if (isHeader(position)) {
        return com.czm.xcrecyclerview.XCRecyclerView.TYPE_HEADER;
    }
    if (isFooter(position)) {
        return com.czm.xcrecyclerview.XCRecyclerView.TYPE_FOOTER;
    }
    int rePosition = position - (getHeaderCount());
    int itemCount = this.mAdapter.getItemCount();
    if (rePosition < itemCount) {
        return this.mAdapter.getItemViewType(position);
    }
    return com.czm.xcrecyclerview.XCRecyclerView.TYPE_LIST_ITEM;
}
public void notifyAdapterItemRangeInserted(int position, int itemCount) {
    mSelections = com.mikepenz.fastadapter.utils.AdapterUtil.adjustPosition(mSelections, position, java.lang.Integer.MAX_VALUE, itemCount);
    mExpanded = com.mikepenz.fastadapter.utils.AdapterUtil.adjustPosition(mExpanded, position, java.lang.Integer.MAX_VALUE, itemCount);
    com.mikepenz.fastadapter.FastAdapter.notifyItemRangeInserted(position, itemCount);
    cacheSizes();
}
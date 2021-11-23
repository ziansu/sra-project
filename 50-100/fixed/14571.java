public void notifyAdapterItemRangeRemoved(int position, int itemCount) {
    mSelections = com.mikepenz.fastadapter.utils.AdapterUtil.adjustPosition(mSelections, position, java.lang.Integer.MAX_VALUE, (itemCount * (-1)));
    mExpanded = com.mikepenz.fastadapter.utils.AdapterUtil.adjustPosition(mExpanded, position, java.lang.Integer.MAX_VALUE, (itemCount * (-1)));
    cacheSizes();
    com.mikepenz.fastadapter.FastAdapter.notifyItemRangeRemoved(position, itemCount);
}
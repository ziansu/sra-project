public void notifyAdapterItemRemoved(int position) {
    mSelections = com.mikepenz.fastadapter.utils.AdapterUtil.adjustPosition(mSelections, position, java.lang.Integer.MAX_VALUE, (-1));
    mExpanded = com.mikepenz.fastadapter.utils.AdapterUtil.adjustPosition(mExpanded, position, java.lang.Integer.MAX_VALUE, (-1));
    com.mikepenz.fastadapter.FastAdapter.notifyItemRemoved(position);
    cacheSizes();
}
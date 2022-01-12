private void updateVisible() {
    boolean visible = mCondition.eval();
    if (visible != (mVisible)) {
        int removeCount = (mVisible) ? mAdapter.getItemCount() : 0;
        mVisible = visible;
        updateDataObserver();
        int insertCount = (mVisible) ? mAdapter.getItemCount() : 0;
        if (removeCount > 0) {
            notifyItemRangeRemoved(0, removeCount);
        }
        if (insertCount > 0) {
            notifyItemRangeInserted(0, insertCount);
        }
    }
}
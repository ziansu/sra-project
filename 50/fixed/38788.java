public void clear() {
    int size = mDataList.size();
    mDataList.clear();
    rgun.vktestapp.ui.extras.RecyclerViewAdapter.notifyItemRangeRemoved(0, size);
}
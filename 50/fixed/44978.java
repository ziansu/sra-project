public void clear() {
    int size = mData.size();
    if (size > 0) {
        mData.clear();
        mDataObservable.notifyItemRangeRemoved(0, size);
    }
}
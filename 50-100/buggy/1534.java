private void deleteItem(int position) {
    if ((mAllDatas) != null) {
        int size = mAllDatas.size();
        if (size > position) {
            mAllDatas.remove(position);
            com.rsen.base.RBaseAdapter.notifyItemRemoved(position);
            com.rsen.base.RBaseAdapter.notifyItemRangeChanged(position, (size - position));
        }
    }
}
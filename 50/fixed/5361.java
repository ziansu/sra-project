public void remove(T object) {
    mData.remove(object);
    cn.lemon.view.adapter.RecyclerAdapter.notifyItemRemoved(mData.indexOf(object));
    (mViewCount)--;
}
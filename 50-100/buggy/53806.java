public void addFootView(android.view.View view, boolean isNotify) {
    if (view == null) {
        throw new java.lang.NullPointerException("the foot view can not be null");
    }
    foots.add(view);
    (mType)--;
    footList.add(mType);
    if (isNotify) {
        com.xiaojinzi.code.util.recyclerView.CommonRecyclerViewAdapter.notifyItemInserted(getItemCount());
    }
}
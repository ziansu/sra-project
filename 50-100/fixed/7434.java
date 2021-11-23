public OL getItem(int position) {
    if ((mList) != null) {
        if ((position >= 0) && (position < (mList.size()))) {
            return mList.get(position);
        }
        com.openarena.util.L.e(com.openarena.model.AbstractRecyclerAdapter.class, (("no item[" + position) + "]"));
    }
    com.openarena.util.L.e(com.openarena.model.AbstractRecyclerAdapter.class, "error to get item");
    return null;
}
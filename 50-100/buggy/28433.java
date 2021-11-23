private void initData() {
    mList.clear();
    com.avos.avoscloud.AVQuery<com.avos.avoscloud.AVObject> avQuery = new com.avos.avoscloud.AVQuery("Product");
    avQuery.orderByDescending("createdAt");
    avQuery.include("owner");
    avQuery.findInBackground(new com.avos.avoscloud.FindCallback<com.avos.avoscloud.AVObject>() {
        @java.lang.Override
        public void done(java.util.List<com.avos.avoscloud.AVObject> list, com.avos.avoscloud.AVException e) {
            if (e == null) {
                mList.addAll(list);
                mRecyclerAdapter.notifyDataSetChanged();
            }else {
                e.printStackTrace();
            }
        }
    });
}
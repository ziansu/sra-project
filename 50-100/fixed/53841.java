@java.lang.Override
protected void onPostExecute(java.util.List<xyz.yluo.ruisiapp.data.ForumListData> simpledatas) {
    if ((simpledatas.size()) > 0) {
        datas.clear();
        datas.addAll(simpledatas);
        adapter.notifyDataSetChanged();
    }
    refreshLayout.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            refreshLayout.setRefreshing(false);
        }
    }, 500);
}
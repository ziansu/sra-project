@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    if ((CampusBLService.nextLatestPosts.size()) != 0) {
        bl.CampusBLService.moveLatestPosts();
        adapter.notifyDataSetChanged();
    }
    container.hideFooterView();
}
@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    bl.CampusBLService.moveLatestPosts();
    adapter.notifyDataSetChanged();
    container.hideFooterView();
    container.hideFooterView();
}
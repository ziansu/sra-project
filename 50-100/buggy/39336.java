@java.lang.Override
protected void onPostExecute(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> result) {
    super.onPostExecute(result);
    datas.clear();
    datas.addAll(result);
    mAdapter.notifyDataSetChanged();
    mSwipeRefreshLayout.setRefreshing(false);
    mSwipeRefreshLayout.setEnabled(true);
}
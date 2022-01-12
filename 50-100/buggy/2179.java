@java.lang.Override
protected void onPostExecute(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> result) {
    super.onPostExecute(result);
    datas.clear();
    datas.addAll(result);
    mAdapter.notifyDataSetChanged();
    mSwipeRefreshLayout.setEnabled(true);
    mSwipeRefreshLayout.setRefreshing(false);
    android.util.Log.d(com.leec.tools.apps.AppsActivity.TAG, "Load packages info finished.");
}
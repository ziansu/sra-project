@java.lang.Override
protected void onPostExecute(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> result) {
    super.onPostExecute(result);
    mSwipeRefreshLayout.setEnabled(true);
    mSwipeRefreshLayout.setRefreshing(false);
    datas.clear();
    datas.addAll(result);
    mAdapter.notifyDataSetChanged();
    android.util.Log.d(com.leec.tools.apps.AppsActivity.TAG, "Load packages info finished.");
}
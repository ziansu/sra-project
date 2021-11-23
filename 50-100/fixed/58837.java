@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.w3bshark.android_weather.Day> result) {
    if ((result != null) && (!(result.isEmpty()))) {
        days.clear();
        days.addAll(result);
    }
    if ((mRecyclerAdapter) == null) {
        initializeAdapter();
    }else {
        mRecyclerAdapter.notifyDataSetChanged();
    }
    mSwipeRefreshLayout.setRefreshing(false);
}
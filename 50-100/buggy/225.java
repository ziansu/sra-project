@java.lang.Override
public void onRefresh() {
    android.content.Context context = this;
    if (isConnected(context, android.preference.PreferenceManager.getDefaultSharedPreferences(context))) {
        refreshContent();
    }else {
        android.widget.Toast toast = android.widget.Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT);
        toast.show();
        refreshRecyclerView(mRecyclerView, mSwipeRefreshLayout, context);
        mSwipeRefreshLayout.setRefreshing(false);
    }
}
@java.lang.Override
public void done(java.util.List<com.parse.ParseObject> list, com.parse.ParseException e) {
    progress.dismiss();
    if (mSwipeRefreshLayout.isRefreshing()) {
        mSwipeRefreshLayout.setRefreshing(false);
    }
    if (e == null) {
        setPostMessageAdapter(list);
    }else {
        android.util.Log.d("parse query", "error with parseQuery");
    }
}
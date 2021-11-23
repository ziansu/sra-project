@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    swipeRefreshLayout.setRefreshing(false);
    adapter.setCursor(data);
    updateEmptyView();
    if ((data.getCount()) == 0)
        supportStartPostponedEnterTransition();
    else
        recyclerView.getViewTreeObserver().addOnPreDrawListener(this);
    
}
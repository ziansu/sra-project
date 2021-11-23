@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> cursorLoader, android.database.Cursor cursor) {
    com.example.xyzreader.ui.ArticleListActivity.Adapter adapter = new com.example.xyzreader.ui.ArticleListActivity.Adapter(cursor);
    adapter.setHasStableIds(true);
    mRecyclerView.setAdapter(adapter);
    int columnCount = getResources().getInteger(R.integer.list_column_count);
    android.support.v7.widget.StaggeredGridLayoutManager sglm = new android.support.v7.widget.StaggeredGridLayoutManager(columnCount, android.support.v7.widget.StaggeredGridLayoutManager.VERTICAL);
    mRecyclerView.setLayoutManager(sglm);
    scheduleStartPostponedTransition(mRecyclerView);
}
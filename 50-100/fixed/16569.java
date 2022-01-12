@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> cursorLoader, android.database.Cursor cursor) {
    com.example.xyzreader.ui.ArticleListActivity.Adapter adapter = new com.example.xyzreader.ui.ArticleListActivity.Adapter(cursor);
    adapter.setHasStableIds(true);
    mRecyclerView.setAdapter(adapter);
    android.support.v7.widget.LinearLayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    mRecyclerView.setLayoutManager(layoutManager);
}
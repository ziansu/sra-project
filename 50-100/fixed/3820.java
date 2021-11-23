@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    if ((mAdapter) != null) {
        mAdapter.clear();
        mAdapter.clear();
        mAdapter.notifyDataSetChanged();
        mAdapter.update(data);
        mAdapter.notifyDataSetChanged();
    }
    android.util.Log.i(eu.nikolay_angelov.popularmovies.MovieListActivity.TAG, "onLoadFinished");
}
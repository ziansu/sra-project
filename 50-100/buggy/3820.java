@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    if ((mAdapter) != null) {
        mAdapter.clear();
    }
    android.util.Log.i(eu.nikolay_angelov.popularmovies.MovieListActivity.TAG, "onLoadFinished");
    mAdapter.clear();
    mAdapter.notifyDataSetChanged();
    mAdapter.update(data);
    mAdapter.notifyDataSetChanged();
}
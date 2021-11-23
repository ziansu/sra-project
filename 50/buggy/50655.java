@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> cursorLoader) {
    android.util.Log.i(Constants.APP_NAME, "onLoaderReset");
    mMovieGridAdapter.swapCursor(null);
}
@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.util.Log.v(com.example.kacyn.popularmovies.DetailActivityFragment.LOG_TAG, "in onLoaderReset");
    switch (loader.getId()) {
        case com.example.kacyn.popularmovies.DetailActivityFragment.DETAIL_LOADER :
            mDetailAdapter.swapCursor(null);
            break;
        case com.example.kacyn.popularmovies.DetailActivityFragment.REVIEW_LOADER :
            mReviewAdapter.swapCursor(null);
            break;
        case com.example.kacyn.popularmovies.DetailActivityFragment.TRAILER_LOADER :
            mTrailerAdapter.swapCursor(null);
            break;
        default :
            break;
    }
}
@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    android.util.Log.i(Constants.APP_NAME, "onCreateLoader");
    com.franktan.popularmovies.MoviesGridFragment.mSortOrderPreference = com.franktan.popularmovies.util.Utilities.getSortOrderPreference(getActivity());
    android.net.Uri movieUri = MovieContract.MovieEntry.CONTENT_URI;
    java.lang.String sortOrder;
    if (com.franktan.popularmovies.MoviesGridFragment.mSortOrderPreference.equals("Rating")) {
        sortOrder = (MovieContract.MovieEntry.COLUMN_VOTE_AVERAGE) + " DESC";
    }else {
        sortOrder = (MovieContract.MovieEntry.COLUMN_POPULARITY) + " DESC";
    }
    return new android.support.v4.content.CursorLoader(getActivity(), movieUri, com.franktan.popularmovies.MoviesGridFragment.MOVIE_COLUMNS, null, null, sortOrder);
}
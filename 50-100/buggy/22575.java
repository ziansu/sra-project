@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    java.lang.String sortOrder = null;
    java.lang.String order = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(this.getString(R.string.pref_sorting_list_key), this.getString(R.string.pref_sorting_default));
    if (order == "popularity.desc") {
        sortOrder = (MovieContract.MovieEntry.COLUMN_MOVIE_POPULARITY) + " DESC";
    }else {
        sortOrder = (MovieContract.MovieEntry.COLUMN_MOVIE_RATING) + " DESC";
    }
    return new android.support.v4.content.CursorLoader(getActivity(), MovieContract.MovieEntry.CONTENT_URI, com.example.android.brolegend.rich_hook.MainActivityFragment.MOVIE_COLUMNS, null, null, sortOrder);
}
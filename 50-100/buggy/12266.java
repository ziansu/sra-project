@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    java.lang.String sortOrder = getSortOrder();
    if (sortOrder.equals(getActivity().getString(R.string.pref_sort_favorites))) {
        sortOrder = (MoviesContract.MoviesEntry.COLUMN_POPULARITY) + " DESC";
    }
    return new android.support.v4.content.CursorLoader(getActivity(), MoviesContract.MoviesEntry.CONTENT_URI, null, null, null, sortOrder);
}
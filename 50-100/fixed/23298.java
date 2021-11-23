@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    java.lang.String sortOrder = com.udacity.movie.utils.Utility.getPreferredSortOrder(getActivity());
    java.lang.String orderKey = com.udacity.movie.utils.Utility.getOrderUrlKey(getActivity());
    java.lang.String[] selection = new java.lang.String[]{ orderKey };
    return new android.support.v4.content.CursorLoader(getActivity(), com.udacity.movie.MyApplication.uri, null, null, selection, (sortOrder + " DESC"));
}
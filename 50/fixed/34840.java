@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    return new android.support.v4.content.CursorLoader(getActivity(), contactsQueryUri, projection, null, null, null);
}
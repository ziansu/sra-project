@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    if ((com.playing.lokasee.fragments.SearchFragment.LIST_ID) == id) {
        java.lang.String selection = null;
        if (!(name.equals(""))) {
            selection = (((UserDao.Properties.Name.columnName) + " like '%") + (name)) + "%'";
        }
        return new android.content.CursorLoader(getActivity(), com.playing.lokasee.repositories.provider.UserContentProvider.CONTENT_URI, null, selection, null, null);
    }
    return null;
}
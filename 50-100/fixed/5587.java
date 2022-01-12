@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    android.util.Log.v("cursorStatus", "Getting cursor loader");
    if (id == 1) {
        java.lang.String[] columns = new java.lang.String[]{ Contract.Lingodecks_Tables._ID , Contract.Lingodecks_Tables.COLUMN_GER , Contract.Lingodecks_Tables.COLUMN_GER_ENG };
        return new android.content.CursorLoader(this, Contract.Lingodecks_Tables.CONTENT_URI1, columns, null, null, "RANDOM()");
    }
    return null;
}
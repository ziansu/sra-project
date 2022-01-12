@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    return new android.content.CursorLoader(this, com.scrawlsoft.gjournal.data.GJEntryProvider.CONTENT_URI, null, null, null, null);
}
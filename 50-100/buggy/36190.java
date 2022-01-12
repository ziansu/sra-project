@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> cursorLoader, android.database.Cursor cursor) {
    if (!(isAdded())) {
        if (cursor != null) {
            cursor.close();
        }
        return ;
    }
    mCursor = cursor;
    if (((mCursor) != null) && (!(mCursor.moveToFirst()))) {
        android.util.Log.e(com.example.xyzreader.ui.ArticleDetailFragment.TAG, "Error reading item detail cursor");
        mCursor.close();
        mCursor = null;
    }
    bindViews();
}
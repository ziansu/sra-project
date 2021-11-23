public android.database.Cursor fetchCourse(long rowId) {
    android.database.Cursor mCursor = database.query(true, com.fabricioph.piteacher.adapters.DBAdapter.TABLE_COURSE, new java.lang.String[]{ com.fabricioph.piteacher.adapters.DBAdapter.C_KEY_ROWID , com.fabricioph.piteacher.adapters.DBAdapter.C_TITLE , com.fabricioph.piteacher.adapters.DBAdapter.C_DESCRIPTION , com.fabricioph.piteacher.adapters.DBAdapter.C_LOCATION , com.fabricioph.piteacher.adapters.DBAdapter.C_MAIL , com.fabricioph.piteacher.adapters.DBAdapter.C_APPROVAL_CRITERIA }, ((com.fabricioph.piteacher.adapters.DBAdapter.C_KEY_ROWID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(rowId) }, null, null, null, null);
    if (mCursor != null) {
        mCursor.moveToFirst();
    }
    return mCursor;
}
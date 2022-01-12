private android.database.Cursor select(java.lang.String query) {
    return mDB.rawQuery(query, null);
}
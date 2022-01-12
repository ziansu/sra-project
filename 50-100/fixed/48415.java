private int update_Android42(java.lang.String dbgContext, android.content.Context context, long id, java.io.File file) {
    if (((file != null) && (file.exists())) && (file.canRead())) {
        android.content.ContentValues values = new android.content.ContentValues();
        getExifFromFile(values, file);
        return de.k3b.android.androFotoFinder.queries.FotoSql.execUpdate(dbgContext, context, id, values);
    }
    return 0;
}
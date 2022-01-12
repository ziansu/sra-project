private android.database.Cursor getPersonWithName(android.net.Uri uri, java.lang.String[] projection, java.lang.String sortOrder) {
    java.lang.String name = SqliteExampleColumns.PersonEntry.getNameFromUri(uri);
    personQueryBuilder = new android.database.sqlite.SQLiteQueryBuilder();
    return personQueryBuilder.query(dbHelpler.getReadableDatabase(), projection, hayen.com.practices.data.PersonProvider.mNameClause, new java.lang.String[]{ name }, null, null, sortOrder);
}
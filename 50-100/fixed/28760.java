public static java.util.ArrayList executeQuery(java.lang.String query, java.lang.String... args) {
    java.util.ArrayList entries = new java.util.ArrayList();
    android.database.Cursor results = com.vetoquinol.vetosynch.DBManager.myDB.rawQuery(query, args);
    while (results.moveToNext()) {
        java.util.HashMap entry = new java.util.HashMap();
        for (java.lang.String columnName : results.getColumnNames()) {
            entry.put(columnName, results.getString(results.getColumnIndex(columnName)));
        }
        entries.add(entry);
    } 
    results.close();
    return entries;
}
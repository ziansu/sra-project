public java.lang.String[] getDataSetColumns() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor dbCursor = db.query(com.example.aly.indoornavigationapp.DatabaseHelper.DATASET_TABLE_NAME, null, null, null, null, null, null);
    java.lang.String[] Columns = dbCursor.getColumnNames();
    dbCursor.close();
    return Columns;
}
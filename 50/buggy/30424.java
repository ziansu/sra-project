public void addLabel(java.lang.String text) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(exjobb.selfannotationsystem.Database.DBLabelHelper.COLUMN_VALUE, text);
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insert(exjobb.selfannotationsystem.Database.DBLabelHelper.TABLE_LABELS, null, values);
    db.close();
}
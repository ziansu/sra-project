public boolean insertValues(java.lang.String name, java.lang.String icon, java.lang.String tag) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put("name", name);
    contentValues.put("icon", icon);
    contentValues.put("tag", tag);
    db.insert(com.example.rohit.tagapp.SqlActions.tableName, null, contentValues);
    android.util.Log.i("values inserted", "done");
    return true;
}
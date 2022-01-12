void newList(java.lang.String name) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(DatabaseHelper.LIST_NAME, name);
    database.insert(DatabaseHelper.TABLE_NAME_MASTER, null, contentValues);
}
void newList(java.lang.String listname) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(DatabaseHelper.LIST_NAME, listname);
    database.insert(DatabaseHelper.TABLE_NAME_MASTER, null, contentValues);
}
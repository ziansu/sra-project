public long insertRow(java.lang.String name, int gender, int phone, java.lang.Double salary, boolean language) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.pinku.sqlitedatabase.DBHelper.KEY_NAME, name);
    contentValues.put(com.pinku.sqlitedatabase.DBHelper.KEY_GENDER, gender);
    contentValues.put(com.pinku.sqlitedatabase.DBHelper.KEY_PHONE, phone);
    contentValues.put(com.pinku.sqlitedatabase.DBHelper.KEY_SALARY, salary);
    contentValues.put(com.pinku.sqlitedatabase.DBHelper.KEY_LANG, language);
    return db.insert(com.pinku.sqlitedatabase.DBHelper.DatabaseTable, null, contentValues);
}
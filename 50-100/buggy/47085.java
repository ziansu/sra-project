public java.util.List<java.lang.String> getAllNames() {
    java.util.List<java.lang.String> names = new java.util.ArrayList<>();
    if (!(mDbHelper.isDbOpen()))
        mDbHelper.open();
    
    android.database.Cursor cursor = mDbHelper.queryAllNames();
    while (cursor.moveToNext()) {
        java.lang.String name = cursor.getString(cursor.getColumnIndex("name"));
        names.add(name);
    } 
    cursor.close();
    return names;
}
java.util.ArrayList<java.lang.String> retrieveDate(java.lang.String column) {
    java.lang.String query = "SELECT * FROM " + (SqliteHelpers.TABLE_NAME);
    mCursor = mDbHelper.rawQuery(query, null);
    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
    while (mCursor.moveToNext()) {
        java.lang.String itemname = mCursor.getString(mCursor.getColumnIndex(column));
        if (itemname != null) {
            arrayList.add(itemname);
        }
    } 
    return arrayList;
}
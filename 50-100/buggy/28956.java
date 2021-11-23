private android.database.Cursor readDB() {
    activity.dbHelper helper = new activity.dbHelper(this, dbConstants.myConstants.NAME, null, dbConstants.myConstants.VERSION);
    dbRead = helper.getReadableDatabase();
    java.lang.String[] projection = new java.lang.String[]{ dbConstants.myConstants.ID , dbConstants.myConstants.FOOD , dbConstants.myConstants.PRICE };
    java.lang.String selection = null;
    java.lang.String[] selectionArgs = null;
    java.lang.String groupBy = null;
    java.lang.String having = null;
    java.lang.String order = null;
    android.database.Cursor cursor = dbRead.query(dbConstants.myConstants.GROCERY_LIST, projection, selection, selectionArgs, groupBy, having, order);
    return cursor;
}
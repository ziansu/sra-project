private android.database.Cursor readDB() {
    activity.dbHelper helper = new activity.dbHelper(this, dbConstants.myConstants.NAME, null, dbConstants.myConstants.VERSION);
    dbRead = helper.getReadableDatabase();
    java.lang.String[] projection = new java.lang.String[]{ dbConstants.myConstants.ID , dbConstants.myConstants.FOOD , dbConstants.myConstants.PRICE };
    return dbRead.query(dbConstants.myConstants.GROCERY_LIST, projection, null, null, null, null, null);
}
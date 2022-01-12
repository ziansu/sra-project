public void create(com.eventhorizonsentertainment.simpleto_do.model.ListItem item) {
    android.database.sqlite.SQLiteDatabase database = open();
    database.beginTransaction();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(SQLiteHelper.COLUMN_ITEM_NAME, item.getItemName());
    long tableID = database.insert(SQLiteHelper.LIST_TABLE, null, contentValues);
    item.setIndex(BaseColumns._ID);
    database.setTransactionSuccessful();
    database.endTransaction();
    close(database);
}
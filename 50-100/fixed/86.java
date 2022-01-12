public void updateList(java.util.ArrayList<com.eventhorizonsentertainment.simpleto_do.model.ListItem> list) {
    android.database.sqlite.SQLiteDatabase database = open();
    android.content.ContentValues values = new android.content.ContentValues();
    for (com.eventhorizonsentertainment.simpleto_do.model.ListItem item : list) {
        values.put(SQLiteHelper.COLUMN_ITEM_NAME, item.getItemName());
    }
    database.update(SQLiteHelper.LIST_TABLE, values, null, null);
    close(database);
}
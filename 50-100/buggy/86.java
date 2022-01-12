public void updateList(java.util.ArrayList<com.eventhorizonsentertainment.simpleto_do.model.ListItem> list) {
    android.database.sqlite.SQLiteDatabase database = open();
    for (com.eventhorizonsentertainment.simpleto_do.model.ListItem item : list) {
        android.content.ContentValues values = new android.content.ContentValues();
        values.put(SQLiteHelper.COLUMN_ITEM_NAME, item.getItemName());
        database.update(SQLiteHelper.LIST_TABLE, values, null, null);
    }
    close(database);
}
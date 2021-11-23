public void renameGroup(java.lang.String oldGroupName, java.lang.String newGroupName) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL((((((((((("update " + (com.example.jonathan.inventoryassistant.ItemReaderContract.ItemEntry.TABLE_NAME)) + " set ") + (com.example.jonathan.inventoryassistant.ItemReaderContract.ItemEntry.GROUP_NAME)) + "='") + newGroupName) + "'") + " where ") + (com.example.jonathan.inventoryassistant.ItemReaderContract.ItemEntry.GROUP_NAME)) + "='") + oldGroupName));
}
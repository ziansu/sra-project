public static android.database.Cursor ReadAll(android.content.Context context) {
    com.example.android.inventory.DbUtils.mDbHelper = new com.example.android.inventory.InventoryDbHelper(context);
    android.database.sqlite.SQLiteDatabase db = com.example.android.inventory.DbUtils.mDbHelper.getWritableDatabase();
    java.lang.String[] projection = new java.lang.String[]{ InventoryContract.ProductEntry.COLUMN_NAME_PRODC_NAME , InventoryContract.ProductEntry.COLUMN_NAME_QUANTITY , InventoryContract.ProductEntry.COLUMN_NAME_PRICE };
    java.lang.String sortOrder = (InventoryContract.ProductEntry.COLUMN_NAME_PRODC_NAME) + " DESC";
    android.database.Cursor c = db.query(InventoryContract.ProductEntry.TABLE_NAME, projection, InventoryContract.ProductEntry.COLUMN_NAME_PRODC_NAME, null, null, null, sortOrder);
    return c;
}
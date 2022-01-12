private void insertDummyData() {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(InventoryContract.InventoryEntry.COLUMN_ITEM_NAME, "Sample");
    values.put(InventoryContract.InventoryEntry.COLUMN_ITEM_DESCRIPTION, "Add Description Here");
    values.put(InventoryContract.InventoryEntry.COLUMN_ITEM_AVAILABLE_QUANTITY, 10);
    values.put(InventoryContract.InventoryEntry.COLUMN_ITEM_PRICE, 100);
    values.put(InventoryContract.InventoryEntry.COLUMN_SUPPLIER_NAME, "XYZ");
    values.put(InventoryContract.InventoryEntry.COLUMN_IMAGE, R.drawable.done);
    getContentResolver().insert(InventoryContract.InventoryEntry.CONTENT_URI, values);
}
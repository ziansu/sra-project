private void insertDummyProduct() {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(ProductEntry.COLUMN_PRODUCT_NAME, "Slinky");
    values.put(ProductEntry.COLUMN_PRODUCT_QUANTITY, 5);
    values.put(ProductEntry.COLUMN_PRODUCT_PRICE, 33.33);
    values.put(ProductEntry.COLUMN_PRODUCT_INSTOCK, 1);
    values.put(ProductEntry.COLUMN_PRODUCT_IMAGE, "fakebytemap");
    android.net.Uri newUri = getContentResolver().insert(ProductEntry.CONTENT_URI, values);
    android.util.Log.i(com.gorgant.storeapp170411.StoreFrontActivity.LOG_TAG, newUri.toString());
}
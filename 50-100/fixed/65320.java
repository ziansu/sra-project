@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int i, android.os.Bundle bundle) {
    android.util.Log.i(com.aasavari.inventoryapp.EditorActivity.LOG_TAG, " onCreateLoader");
    java.lang.String[] projection = new java.lang.String[]{ com.aasavari.inventoryapp.data.InventoryContract.ProductEntry._ID , com.aasavari.inventoryapp.data.InventoryContract.ProductEntry.COLUMN_PROD_NAME , com.aasavari.inventoryapp.data.InventoryContract.ProductEntry.COLUMN_PROD_PRICE , com.aasavari.inventoryapp.data.InventoryContract.ProductEntry.COLUMN_PROD_QUANTITY , com.aasavari.inventoryapp.data.InventoryContract.ProductEntry.COLUMN_PROD_SUPPLIER , com.aasavari.inventoryapp.data.InventoryContract.ProductEntry.COLUMN_PROD_SALE , com.aasavari.inventoryapp.data.InventoryContract.ProductEntry.COLUMN_PROD_IMAGE };
    return new android.content.CursorLoader(this, mCurrentProductUri, projection, null, null, null);
}
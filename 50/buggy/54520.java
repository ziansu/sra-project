@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    android.util.Log.i(com.aasavari.inventoryapp.EditorActivity.LOG_TAG, "Aasavari: onLoaderReset");
    mName.setText("");
    mPrice.setText("");
    mQuantity.setText("");
    mSupplier.setText("");
}
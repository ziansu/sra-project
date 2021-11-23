@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    java.lang.String[] projection = new java.lang.String[]{ com.patane.riccardo.inventory.data.ProductContract.ProductEntry.COLUMN_NAME , com.patane.riccardo.inventory.data.ProductContract.ProductEntry.COLUMN_QUANTITY , com.patane.riccardo.inventory.data.ProductContract.ProductEntry.COLUMN_PRICE , com.patane.riccardo.inventory.data.ProductContract.ProductEntry._ID };
    return new android.content.CursorLoader(this, com.patane.riccardo.inventory.data.ProductContract.ProductEntry.CONTENT_URI, projection, null, null, null);
}
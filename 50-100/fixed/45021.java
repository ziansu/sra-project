@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> listView, android.view.View itemView, int position, long id) {
    android.content.Intent editIntent = new android.content.Intent(this, com.aasavari.inventoryapp.EditorActivity.class);
    android.net.Uri currentProductUri = android.content.ContentUris.withAppendedId(com.aasavari.inventoryapp.data.InventoryContract.ProductEntry.CONTENT_URI, id);
    editIntent.setData(currentProductUri);
    startActivity(editIntent);
}
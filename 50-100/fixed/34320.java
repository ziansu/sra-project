@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, com.example.android.inventory.DetailsActivity.class);
    android.net.Uri currentItemUri = android.content.ContentUris.withAppendedId(StoreEntry.CONTENT_URI, id);
    intent.setData(currentItemUri);
    startActivity(intent);
}
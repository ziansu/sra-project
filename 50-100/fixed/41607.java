@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    switch (item.getItemId()) {
        case R.id.barcode :
            android.content.Intent i = new android.content.Intent(this, io.moffat.kitchenpal.BarcodeScanner.class);
            startActivity(i);
        case R.id.refresh :
            refreshList();
    }
    return super.onOptionsItemSelected(item);
}
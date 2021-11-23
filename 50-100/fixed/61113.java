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
            return true;
        case android.R.id.home :
            this.finish();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}
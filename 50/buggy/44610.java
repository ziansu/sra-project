public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_barcode :
            new com.google.zxing.integration.android.IntentIntegrator(this).initiateScan();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}
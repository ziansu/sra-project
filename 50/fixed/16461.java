@java.lang.Override
public void run() {
    setResult(com.owsega.hellotractorsample.RESULT_OK, getIntent().putExtra(com.owsega.hellotractorsample.FetchAddressIntentService.FARMER_EXTRA, farmer.getId()));
    finish();
}
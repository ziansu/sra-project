@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(de.hft.stuttgart.strawberry.activities.BluetoothSearchActivity.EXTRA_DEVICE_SELECTED, deviceSelected);
    if ((mBTAdapter) != null) {
        mBTAdapter.cancelDiscovery();
    }
    setResult(Activity.RESULT_CANCELED, intent);
    finish();
}
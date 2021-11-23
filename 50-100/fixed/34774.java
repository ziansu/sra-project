@java.lang.Override
protected void onResume() {
    super.onResume();
    if (((mBluetoothAdapter) == null) || (!(mBluetoothAdapter.isEnabled()))) {
        mBluetoothAdapter.enable();
        return ;
    }
    if (!(getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE))) {
        android.widget.Toast.makeText(this, "No LE Support.", Toast.LENGTH_SHORT).show();
        finish();
        return ;
    }
}
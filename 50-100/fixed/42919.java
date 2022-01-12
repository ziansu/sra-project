@java.lang.Override
protected void onResume() {
    super.onResume();
    registerReceiver(mGattUpdateReceiver, edu.nthu.nmsl.itri_app.FragmentActivity.makeGattUpdateIntentFilter());
    if ((mBluetoothLeService) != null) {
        final boolean result = mBluetoothLeService.connect(edu.nthu.nmsl.itri_app.settings.Devices.getInstance().getDeviceAddress(edu.nthu.nmsl.itri_app.Background.getInstance().getUsingSensorID()));
    }
    radioGroup.setOnCheckedChangeListener(radioGroupListener);
}
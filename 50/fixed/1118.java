protected void connectDevice(final org.deviceconnect.android.deviceplugin.hitoe.data.HitoeDevice device) {
    if (org.deviceconnect.android.deviceplugin.hitoe.util.BleUtils.isEnabled(this)) {
        mConnectingDevice = device;
        showProgressDialog(device.getName());
        getManager().connectHitoeDevice(device);
    }
}
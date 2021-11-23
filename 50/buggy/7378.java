private void bindService() {
    android.content.Intent mIntent = new android.content.Intent(this, org.deviceconnect.android.deviceplugin.host.HostDeviceService.class);
    mIntent.setAction("camera");
    bindService(mIntent, mServiceConnection, Context.BIND_AUTO_CREATE);
}
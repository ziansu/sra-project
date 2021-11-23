public void onStart() {
    final android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(UsbEventReceiverActivity.ACTION_USB_PERMISSION);
    intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED);
    mActivity.registerReceiver(mUsbReceiver, intentFilter);
}
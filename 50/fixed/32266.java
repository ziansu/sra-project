public void onStart() {
    final android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(UsbEventReceiverActivity.ACTION_USB_PERMISSION);
    mActivity.registerReceiver(mUsbReceiver, intentFilter);
}
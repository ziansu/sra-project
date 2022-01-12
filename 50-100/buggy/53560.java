@java.lang.Override
public void onCreate() {
    super.onCreate();
    mPermissionIntent = android.app.PendingIntent.getBroadcast(this, 0, new android.content.Intent(com.appspot.usbhidterminal.core.Consts.ACTION_USB_PERMISSION), 0);
    filter = new android.content.IntentFilter(com.appspot.usbhidterminal.core.Consts.ACTION_USB_PERMISSION);
    filter.addAction(UsbManager.ACTION_USB_DEVICE_ATTACHED);
    filter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED);
    filter.addAction(Consts.ACTION_USB_SHOW_DEVICES_LIST);
    filter.addAction(Consts.ACTION_USB_SELECT_DEVICE);
    filter.addAction(Consts.ACTION_USB_SEND_DATA);
    filter.addAction(Consts.ACTION_USB_DATA_TYPE);
    registerReceiver(mUsbReceiver, filter);
    de.greenrobot.event.EventBus.getDefault().register(this);
}
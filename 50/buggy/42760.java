@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    unregisterReceiver(screenBroadcast);
    de.greenrobot.event.EventBus.getDefault().unregister(this);
    notificationManager.cancelAll();
    ringtone = null;
}
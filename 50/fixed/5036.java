@java.lang.Override
public void onDestroy() {
    stop();
    super.onDestroy();
    sendBroadcast(new android.content.Intent(com.urbanairship.cordova.gimbal.GimbalAdapterService.INTENT_START));
}
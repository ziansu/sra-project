@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    com.nosideracing.rchipremote.RemoteMain.json.deauthenticate();
    alarm.cancel(CheckMessagesPendingIntent);
    android.util.Log.d(Consts.LOG_TAG, "onDestroy: rchip");
}
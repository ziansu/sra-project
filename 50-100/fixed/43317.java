@java.lang.Override
public void onCreate() {
    android.util.Log.d("OnCreate", "Started Service");
    loginSettings = getSharedPreferences("LoginPrefs", com.apres.cmps116.url_logger.MODE_PRIVATE);
    com.apres.cmps116.url_logger.MyService.mNM = ((android.app.NotificationManager) (getSystemService(com.apres.cmps116.url_logger.NOTIFICATION_SERVICE)));
    android.util.Log.d("OnCreate", "Before Notification");
    android.util.Log.d("OnCreate", "After Notification");
}
public static void setRingerMode(android.content.Context context, int mode) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    if (((Build.VERSION.SDK_INT) < 24) || (((Build.VERSION.SDK_INT) >= 24) && (!(notificationManager.isNotificationPolicyAccessGranted())))) {
        android.media.AudioManager audioManager = ((android.media.AudioManager) (context.getSystemService(Context.AUDIO_SERVICE)));
        audioManager.setRingerMode(mode);
    }
}
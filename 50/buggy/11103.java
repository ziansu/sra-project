protected void cancelNotification() {
    android.util.Log.i("Cancel", "notification");
    mNotificationManager.cancel(notificationID);
}
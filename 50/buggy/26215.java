@java.lang.Override
protected void onStart() {
    attachDatabaseReadListenerDeliveryStatus();
    attachDatabaseReadListenertoListView();
    super.onStart();
    com.george.getreadychat.UserToUserMessageNotification.isActiveNotification = true;
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(UserDetails.UserChatsWith, 1);
}
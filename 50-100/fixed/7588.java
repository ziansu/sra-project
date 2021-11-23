private void showNotificationMessageWithBigImage(android.content.Context context, java.lang.String title, java.lang.String message, java.lang.String timeStamp, android.content.Intent intent, java.lang.String imageUrl) {
    notificationUtils = new android.stalwartgroup.residentguardo.Util.NotificationUtils(context);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    notificationUtils.showNotificationMessage(title, message, timeStamp, intent, imageUrl);
}
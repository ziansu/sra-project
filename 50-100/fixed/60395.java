public void showNotification(java.lang.String message) {
    java.lang.CharSequence title = getText(NOTIFICATION);
    java.lang.CharSequence content = message;
    android.app.Notification notification = new android.app.Notification.Builder(this).setTicker(title).setWhen(java.lang.System.currentTimeMillis()).setContentTitle(title).setContentText(content).build();
    mNM.notify(NOTIFICATION, notification);
}
public void makeNewClickNotifications(int x, int y) {
    if (mVibrateOnClick) {
        new com.pylapp.smoothclicker.notifiers.VibrationNotifier(mContext).vibrate(VibrationNotifier.VIBRATE_ON_CLICK_DURATION);
    }
    if (mNotifOnClick) {
        new com.pylapp.smoothclicker.notifiers.StatusBarNotifier(mContext).makeNotification(StatusBarNotifier.NotificationTypes.CLICK_MADE, x, y);
    }
}
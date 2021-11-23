public void setNotificationBackgroundColor(@android.support.annotation.ColorInt
int color) {
    this.notificationBackgroundColor = color;
    notificationBackgroundDrawable = com.aurelhubert.ahbottomnavigation.AHHelper.getTintDrawable(notificationBackgroundDrawable, notificationBackgroundColor, true);
    updateNotifications(true, com.aurelhubert.ahbottomnavigation.AHBottomNavigation.UPDATE_ALL_NOTIFICATIONS);
}
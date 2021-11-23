public void setNotificationBackgroundColor(@android.support.annotation.ColorInt
int color) {
    this.notificationBackgroundColor = color;
    updateNotifications(true, com.aurelhubert.ahbottomnavigation.AHBottomNavigation.UPDATE_ALL_NOTIFICATIONS);
}
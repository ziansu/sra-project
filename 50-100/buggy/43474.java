public void setNotificationUICOmponents(int notificationCount) {
    if (notificationCount == 0) {
        _badgeButton.hideBadge();
    }else {
        _badgeButton.setBadgeText(((notificationCount > 99 ? 99 : notificationCount) < 10 ? notificationCount + " " : notificationCount + ""));
        _badgeButton.showBadge();
    }
}
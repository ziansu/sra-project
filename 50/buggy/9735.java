void onCancelAlready(zemin.notification.NotificationEntry entry) {
    entry.sendToTarget(false, ID);
    onCancelFinished(entry);
    mCenter.cancel(entry);
}
private void dispatchChange(boolean selfChange, android.net.Uri uri, int userId) {
    if ((mHandler) == null) {
        onChange(selfChange, uri, userId);
    }else {
        mHandler.post(new android.database.ContentObserver.NotificationRunnable(selfChange, uri, userId));
    }
}
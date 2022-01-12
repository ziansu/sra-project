public void endTransactionAndNotify() {
    if (isInTransaction) {
        isInTransaction = false;
        if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN)) {
            onChange(true);
        }else {
            synchronized(notificationUris) {
                for (android.net.Uri uri : notificationUris) {
                    onChange(true, uri);
                }
                notificationUris.clear();
            }
        }
    }
}
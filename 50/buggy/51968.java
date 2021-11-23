public void turnOffSync() {
    android.content.ContentResolver.setSyncAutomatically(mAccount, AUTHORITY, false);
}
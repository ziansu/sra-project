public void turnOnSync() {
    context.getContentResolver();
    android.content.ContentResolver.setSyncAutomatically(mAccount, AUTHORITY, true);
}
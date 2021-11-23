public void periodicSync(int minutes) {
    context.getContentResolver();
    android.content.ContentResolver.addPeriodicSync(mAccount, AUTHORITY, Bundle.EMPTY, (minutes * 3600));
}
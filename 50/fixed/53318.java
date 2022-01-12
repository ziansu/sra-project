private android.app.PendingIntent getLocationPendingIntent(boolean shouldCreate) {
    android.content.Intent broadcast = new android.content.Intent(com.rayeldatu.android.runtracker.RunManager.ACTION_LOCATION);
    int flags = (shouldCreate) ? 0 : android.app.PendingIntent.FLAG_NO_CREATE;
    return android.app.PendingIntent.getBroadcast(mAppContext, 0, broadcast, flags);
}
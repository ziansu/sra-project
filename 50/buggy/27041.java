public void dispose(android.content.Context context) {
    removeUpdates(context);
    home.yaron.location.LocationTracker.LocationTrackerHolder.INSTANCE = null;
}
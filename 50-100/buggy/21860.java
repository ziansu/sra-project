public void setFollowGPS(boolean follow) {
    android.util.Log.d("Main", ((("setFollowGPS from " + (followGPS)) + " to ") + follow));
    if ((followGPS) != follow) {
        followGPS = follow;
        if (follow) {
            setShowGPS(true);
        }
        map.setFollowGPS(follow);
        triggerMenuInvalidation();
    }
    if (follow && ((lastLocation) != null)) {
        android.util.Log.d("Main", "Setting lastLocation");
        onLocationChanged(lastLocation);
    }
}
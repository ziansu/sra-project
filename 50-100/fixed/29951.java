private com.google.android.gms.location.DetectedActivity walkingOrRunning(java.util.List<com.google.android.gms.location.DetectedActivity> probableActivities) {
    com.google.android.gms.location.DetectedActivity myActivity = null;
    for (com.google.android.gms.location.DetectedActivity activity : probableActivities) {
        if (((activity.getType()) == (com.google.android.gms.location.DetectedActivity.RUNNING)) || ((activity.getType()) == (com.google.android.gms.location.DetectedActivity.WALKING))) {
            if (myActivity == null)
                myActivity = activity;
            else {
                if ((myActivity.getConfidence()) < (activity.getConfidence()))
                    myActivity = activity;
                
            }
        }
    }
    return myActivity;
}
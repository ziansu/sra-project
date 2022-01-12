private com.google.android.gms.location.DetectedActivity walkingOrRunning(java.util.List<com.google.android.gms.location.DetectedActivity> probableActivities) {
    com.google.android.gms.location.DetectedActivity myActivity = null;
    int confidence = 0;
    for (com.google.android.gms.location.DetectedActivity activity : probableActivities) {
        if (((activity.getType()) != (com.google.android.gms.location.DetectedActivity.RUNNING)) && ((activity.getType()) != (com.google.android.gms.location.DetectedActivity.WALKING)))
            continue;
        
        if ((activity.getConfidence()) > confidence) {
            myActivity = activity;
            break;
        }
    }
    return myActivity;
}
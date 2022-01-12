public java.lang.String getUserActivity() {
    java.lang.String activity = "";
    final com.google.android.gms.location.DetectedActivity userActivity = null;
    switch (userActivity.getType()) {
        case com.google.android.gms.location.DetectedActivity.IN_VEHICLE :
            activity = "driving";
            break;
        case com.google.android.gms.location.DetectedActivity.RUNNING :
            activity = "jogging";
            break;
        case com.google.android.gms.location.DetectedActivity.STILL :
            activity = "relaxing";
            break;
        case com.google.android.gms.location.DetectedActivity.TILTING :
            activity = "working";
            break;
        case com.google.android.gms.location.DetectedActivity.UNKNOWN :
            activity = "unknown";
            break;
    }
    return activity;
}
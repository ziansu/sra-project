@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    if (com.google.android.gms.location.ActivityRecognitionResult.hasResult(intent)) {
        com.google.android.gms.location.ActivityRecognitionResult result = com.google.android.gms.location.ActivityRecognitionResult.extractResult(intent);
        com.google.android.gms.location.DetectedActivity CurrentActivity = result.getMostProbableActivity();
        if ((CurrentActivity.getConfidence()) >= 75) {
            ActivityRecognitionPlugin.Activity.ActivityType = CurrentActivity.toString();
            ActivityRecognitionPlugin.Activity.Propability = CurrentActivity.getConfidence();
        }else
            ActivityRecognitionPlugin.Activity.ActivityType = "NotConfidentEnough";
        
    }
}
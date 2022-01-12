private boolean isVoiceAvailable() {
    if (isInEditMode()) {
        return true;
    }
    android.content.pm.PackageManager pm = getContext().getPackageManager();
    java.util.List<android.content.pm.ResolveInfo> activities = pm.queryIntentActivities(new android.content.Intent(android.speech.RecognizerIntent.ACTION_RECOGNIZE_SPEECH), 0);
    return (activities.size()) == 0;
}
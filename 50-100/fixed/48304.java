@java.lang.Override
public boolean isVoiceRecognitionAvailable() {
    android.content.Intent intent = new android.content.Intent(android.speech.RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
    android.content.pm.PackageManager mgr = getContext().getPackageManager();
    if (mgr != null) {
        java.util.List<android.content.pm.ResolveInfo> list = mgr.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        return (list.size()) > 0;
    }
    return false;
}
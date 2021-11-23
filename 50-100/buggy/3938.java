@java.lang.Override
public void onActivityResumed(android.app.Activity activity) {
    if ((clientInstance) == null) {
        android.util.Log.e(com.amplitude.api.AmplitudeCallbacks.TAG, com.amplitude.api.AmplitudeCallbacks.NULLMSG);
        return ;
    }
    android.util.Log.d(com.amplitude.api.AmplitudeCallbacks.TAG, "onActivityResumed");
    clientInstance.startNewSessionIfNeeded(getCurrentTimeMillis(), false);
    clientInstance.setInForeground(true);
}
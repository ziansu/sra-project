@com.facebook.react.bridge.ReactMethod
public void checkForUpdate() {
    android.app.Activity currentActivity = getCurrentActivity();
    if (currentActivity == null) {
        return ;
    }
    if (com.slowpath.hockeyapp.RNHockeyAppModule._initialized) {
        net.hockeyapp.android.UpdateManager.register(currentActivity, com.slowpath.hockeyapp.RNHockeyAppModule._token);
    }
}
@com.facebook.react.bridge.ReactMethod
public void feedback() {
    android.app.Activity currentActivity = getCurrentActivity();
    if (com.slowpath.hockeyapp.RNHockeyAppModule._initialized) {
        currentActivity.runOnUiThread(new java.lang.Runnable() {
            private android.app.Activity currentActivity;

            public java.lang.Runnable init(android.app.Activity activity) {
                currentActivity = activity;
                return this;
            }

            @java.lang.Override
            public void run() {
                net.hockeyapp.android.FeedbackManager.showFeedbackActivity(currentActivity);
            }
        }.init(currentActivity));
    }
}
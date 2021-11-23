@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mCallbackManager = CallbackManager.Factory.create();
    setupTokenTracker();
    setupProfileTracker();
    mTokenTracker.startTracking();
    mProfileTracker.startTracking();
}
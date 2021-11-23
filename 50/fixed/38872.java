@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    activityStack.remove(activity);
}
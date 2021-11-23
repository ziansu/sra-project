@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    ((android.app.Activity) (getContext())).getApplication().unregisterActivityLifecycleCallbacks(this);
}
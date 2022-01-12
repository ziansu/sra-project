@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    if (activity == (getContext())) {
        ((android.app.Activity) (getContext())).getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
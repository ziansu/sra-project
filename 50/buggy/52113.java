@java.lang.Override
public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    addActivity(activity);
    if ((activityLifeHandler) != null)
        activityLifeHandler.onCreated();
    
}
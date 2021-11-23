public void finishActivity(android.app.Activity activity) {
    activityStack.remove(activity);
    if ((activity != null) && (!(activity.isFinishing()))) {
        activity.finish();
    }
}
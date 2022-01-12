public android.app.Activity getCurrentActivity() {
    android.app.Activity activity = com.hitomi.aslibrary.ActivityManager.activityStack.get(((com.hitomi.aslibrary.ActivityManager.activityStack.size()) - 1));
    return activity;
}
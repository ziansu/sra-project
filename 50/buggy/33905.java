public void finishActivity() {
    android.app.Activity activity = com.hitomi.aslibrary.ActivityManager.activityStack.lastElement();
    finishActivity(activity);
}
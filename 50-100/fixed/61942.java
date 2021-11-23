public android.content.Intent getIntent() {
    final android.content.Intent i = android.content.Intent.makeMainActivity(mComponent);
    java.lang.String packageName = mComponent.getPackageName();
    java.lang.String activityName = mComponent.getClassName();
    android.util.Log.d("AppCenter", ("packageName is " + packageName));
    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    return i;
}
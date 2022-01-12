public android.content.Intent getIntent() {
    final android.content.Intent i = android.content.Intent.makeMainActivity(mComponent);
    java.lang.String packageName = mComponent.getPackageName();
    java.lang.String activityName = mComponent.getClassName();
    if ("com.skzh.elifetv.MainActivity".equals(activityName)) {
        intent.putExtra("frag_index", "1");
    }
    android.util.Log.d("AppCenter", ("packageName is " + packageName));
    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    return i;
}
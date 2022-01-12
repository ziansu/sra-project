@java.lang.Override
public void onClick(android.view.View v) {
    android.content.pm.ActivityInfo activityInfo = mResolveInfo.activityInfo;
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_MAIN).setClassName(activityInfo.applicationInfo.packageName, activityInfo.name).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
}
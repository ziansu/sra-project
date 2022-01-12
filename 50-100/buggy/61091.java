@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.blueshift.Blueshift.getInstance(mContext).trackNotificationClick(mMessage, true);
    android.content.pm.PackageManager packageManager = getPackageManager();
    android.content.Intent launcherIntent = packageManager.getLaunchIntentForPackage(getPackageName());
    launcherIntent.putExtra(RichPushConstants.EXTRA_MESSAGE, mMessage);
    launcherIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(launcherIntent);
    com.blueshift.Blueshift.getInstance(mContext).trackNotificationPageOpen(mMessage, true);
    dialog.dismiss();
}
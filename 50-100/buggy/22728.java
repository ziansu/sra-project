private void pullUpMainProcess(android.content.Context context) {
    android.content.Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    launchIntent.setFlags((((android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP) | (android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP)) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)));
    context.startActivity(launchIntent);
    android.util.Log.d(me.ele.amigo.AmigoService.TAG, "start launchIntent");
    stopSelf();
    java.lang.System.exit(0);
    java.lang.Process.killProcess(java.lang.Process.myPid());
}
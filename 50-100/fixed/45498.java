private boolean isMyAppInForeground() {
    android.app.ActivityManager manager = ((android.app.ActivityManager) (context.getSystemService(Context.ACTIVITY_SERVICE)));
    java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningProcesses = manager.getRunningAppProcesses();
    android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningProcesses.get(0);
    if ((runningAppProcessInfo.importance) == (ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND)) {
        java.lang.String activeProcess = runningAppProcessInfo.pkgList[0];
        if (activeProcess.equalsIgnoreCase(context.getPackageName())) {
            return true;
        }
    }
    return false;
}
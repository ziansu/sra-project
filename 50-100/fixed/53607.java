private java.lang.String isAppRunning(android.content.Context context) {
    android.app.ActivityManager activityManager = ((android.app.ActivityManager) (context.getSystemService(Context.ACTIVITY_SERVICE)));
    java.lang.String res = new java.lang.String();
    java.util.List<android.app.ActivityManager.RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
    for (int i = 0; i < (procInfos.size()); i++) {
        res += procInfos.get(i).processName;
    }
    return res;
}
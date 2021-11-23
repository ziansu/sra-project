public static boolean isServiceRun(android.content.Context context) {
    android.app.ActivityManager am = ((android.app.ActivityManager) (context.getSystemService(Context.ACTIVITY_SERVICE)));
    java.util.List<android.app.ActivityManager.RunningServiceInfo> list = am.getRunningServices(60);
    for (android.app.ActivityManager.RunningServiceInfo info : list) {
        java.lang.System.out.println(info.service.getClassName());
        if (info.service.getClassName().equals("com.example.cjl20.psm.MessengerService")) {
            return true;
        }
    }
    return false;
}
public static int getRamPercentage(android.content.Context context) {
    android.app.ActivityManager.MemoryInfo mi = new android.app.ActivityManager.MemoryInfo();
    android.app.ActivityManager activityManager = ((android.app.ActivityManager) (context.getSystemService(android.content.Context.ACTIVITY_SERVICE)));
    activityManager.getMemoryInfo(mi);
    return 100 - ((int) ((((double) (mi.availMem)) / ((double) (mi.totalMem))) * 100));
}
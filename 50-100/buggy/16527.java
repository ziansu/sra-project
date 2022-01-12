private long getMemoryUsage() {
    android.app.ActivityManager.MemoryInfo mi = new android.app.ActivityManager.MemoryInfo();
    android.app.ActivityManager activityManager = ((android.app.ActivityManager) (mContext.getSystemService(Context.ACTIVITY_SERVICE)));
    activityManager.getMemoryInfo(mi);
    long availableMegs = (mi.availMem) / 1048576L;
    long percentAvail = (mi.availMem) / (mi.totalMem);
    return availableMegs;
}
private boolean isMyServiceRunning(java.lang.Class<?> serviceClass) {
    android.app.ActivityManager manager = ((android.app.ActivityManager) (getSystemService(Context.ACTIVITY_SERVICE)));
    for (android.app.ActivityManager.RunningServiceInfo service : manager.getRunningServices(java.lang.Integer.MAX_VALUE)) {
        if (serviceClass.getName().equals(service.service.getClassName())) {
            return true;
        }
    }
    return false;
}
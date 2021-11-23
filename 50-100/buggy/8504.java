private boolean checkIfServiceIsRunning() {
    android.app.ActivityManager manager = ((android.app.ActivityManager) (getSystemService(Context.ACTIVITY_SERVICE)));
    for (android.app.ActivityManager.RunningServiceInfo service : manager.getRunningServices(java.lang.Integer.MAX_VALUE)) {
        if (com.amossys.hooker.service.InstrumentationService.class.getName().equals(service.service.getClassName())) {
            serviceStarted.setText("OFF");
            return true;
        }
    }
    return false;
}
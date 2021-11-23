public void exitApplication() {
    try {
        finishAllActivity();
        android.app.ActivityManager manager = ((android.app.ActivityManager) (context.getSystemService(Context.ACTIVITY_SERVICE)));
        manager.killBackgroundProcesses(context.getPackageName());
        java.lang.System.exit(0);
    } catch (java.lang.Exception e) {
        java.lang.System.exit(0);
    }
}
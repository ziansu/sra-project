private void performCreateLauncher() {
    if ((launcher) == null) {
        android.content.Context context = getApplicationContext();
        android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
        launcher = inflater.inflate(R.layout.service_launcher, null);
        android.view.WindowManager.LayoutParams params = generateLayoutParams();
        windowManager = ((android.view.WindowManager) (getSystemService(Context.WINDOW_SERVICE)));
        windowManager.addView(launcher, params);
        initLauncherChildren(launcher);
    }
}
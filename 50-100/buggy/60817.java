private void performCreateLauncher() {
    accessibilityIntent = new android.content.Intent(this, com.mx.dxinl.quicklauncher.services.NavBtnAccessibilityService.class);
    android.content.Context context = getApplicationContext();
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    moveThreshold = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    launcher = inflater.inflate(R.layout.service_launcher, null);
    android.view.WindowManager.LayoutParams params = generateLayoutParams();
    windowManager = ((android.view.WindowManager) (getSystemService(Context.WINDOW_SERVICE)));
    windowManager.addView(launcher, params);
    initLauncherChildren(launcher);
}
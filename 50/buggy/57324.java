@java.lang.Override
public void onStart() {
    showHomeScreen();
    changeScreenRotationMode(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    setupConnectivityState(true);
    turnScreenOn();
    buildDialog(getResources().getString(R.string.service_connectivity_title), getResources().getString(R.string.service_connectivity_detail));
}
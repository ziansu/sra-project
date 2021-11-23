@java.lang.Override
public void onStart() {
    setupConnectivityState(false);
    turnScreenOn();
    buildGPSDialog(getResources().getString(R.string.service_turn_gps_off_title), getResources().getString(R.string.service_turn_gps_off_detail));
}
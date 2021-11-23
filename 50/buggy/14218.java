@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    scheduleService.cancel();
    mLocationClient.stopLocation();
    mLocationClient.onDestroy();
    stopSelf();
}
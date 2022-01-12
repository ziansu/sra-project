@java.lang.Override
public void onPause() {
    super.onPause();
    try {
        hideProgress();
        unregisterReceiver(locationReceiver);
        locationService.setBroadCastData(StringConstants.DEFAULT);
        if (((locationService) != null) && (locationService.isTrackingLocation())) {
            locationService.stopListners();
        }
        HideKeyboard();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
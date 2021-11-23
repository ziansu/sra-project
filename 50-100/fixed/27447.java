@java.lang.Override
public void onPause() {
    super.onPause();
    try {
        hideProgress();
        unregisterReceiver(locationReceiver);
        if (((locationService) != null) && (locationService.isTrackingLocation())) {
            locationService.stopListners();
        }
        HideKeyboard();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
public void stopTrip() {
    android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean(Constants.IS_DRIVER_ON_TRIP, false).apply();
    addNotification();
    startCalculatingDistanceIfDriverOnTrip();
}
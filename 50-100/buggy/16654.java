private void InitializeTripService() {
    if (!(IsServiceRunning(sw10.ubiforsikring.TripService.class))) {
        android.util.Log.i("Debug", "Starting TripService");
        InitializeTripServiceConnection();
        startService(new android.content.Intent(this, sw10.ubiforsikring.TripService.class));
        BindTripService();
    }else {
        android.util.Log.i("Debug", "TripService already running");
        InitializeTripServiceConnection();
        BindTripService();
        UpdateStatusBroadcast();
    }
}
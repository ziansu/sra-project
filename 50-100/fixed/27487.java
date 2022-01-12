@java.lang.Override
protected void onResume() {
    super.onResume();
    if (!(com.gmail.mkounal.places.Utility.Utility.isLocationEnabled(this))) {
        stopApp(getString(R.string.location_manager_msg));
    }
    if (!(com.gmail.mkounal.places.Utility.Utility.isNetworkEnabled(this))) {
        stopApp(getString(R.string.network_manager_msg));
    }
    if (!(com.gmail.mkounal.places.Utility.Utility.isServiceRunning(this))) {
        android.content.Intent startServiceIntent = new android.content.Intent(this, com.gmail.mkounal.places.Service.PlacesService.class);
        startService(startServiceIntent);
    }
}
private void startService() {
    android.content.Intent intent = new android.content.Intent(this, com.example.filip.gpsrecorder.LocationUpdateService.class);
    updateBtnText((!(LocationUpdateService.isRunning)));
    if (LocationUpdateService.isRunning) {
        stopService(intent);
    }else {
        android.util.Log.d("", "Starting service");
        startService(intent);
    }
}
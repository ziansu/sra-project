private void processData() {
    android.util.Log.e(com.example.sdp11.wmd.BluetoothLEService.TAG, "In processData");
    double initialDirection = calculateInitialDirection();
    double finalDirection = calculateFinalDirection();
    double throwQuality = calculateThrowQuality();
    double totalDistance = 1;
    double totalTime = 1;
    MainActivity.dataSource.createThrow(initialDirection, finalDirection, totalDistance, throwQuality, totalTime);
}
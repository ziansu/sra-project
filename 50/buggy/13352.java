public void onScan() {
    requestLocationPermissionIfNeeded(new java.lang.Runnable() {
        public void run() {
            scanLeDevice(true);
        }
    });
}
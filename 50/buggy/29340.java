public void onConnected(android.os.Bundle connectionHint) {
    if (mRequestingLocationUpdates) {
        startLocationUpdates();
    }
}
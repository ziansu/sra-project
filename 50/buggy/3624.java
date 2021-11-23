protected synchronized void clearAndAddToMap() {
    if ((mMap) != null) {
        android.util.Log.d("stop_add_buses", buses.toString());
        stopTimer();
        addBuses();
    }
}
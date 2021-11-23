public void unsubscribeUpdates(com.example.jonathan.myapplication.GPSUpdate removeListener) {
    synchronized(this.notificationSetLock) {
        this.notificationSet.remove(removeListener);
        android.util.Log.d("GPS", (("Removing " + (removeListener.toString())) + " from GPS event listener pool."));
    }
}
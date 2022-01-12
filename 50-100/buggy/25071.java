@java.lang.Override
public void run() {
    run = true;
    android.util.Log.i(com.remulasce.lametroapp.TripPopulator.TAG, "UpdateRunner starting");
    while (run) {
        updateTrackedMap();
        cullInvalidTrips();
        updateListView();
        try {
            java.lang.Thread.sleep(com.remulasce.lametroapp.TripPopulator.UPDATE_INTERVAL);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    android.util.Log.i(com.remulasce.lametroapp.TripPopulator.TAG, "UpdateRunner ending");
}
@java.lang.Override
public void run() {
    while ((!(mIsStopThreads)) && ((mLocationQueue.size()) != 0)) {
        android.location.Location location = mLocationQueue.poll();
        if (location != null) {
            mDBHelper.addPoint(location);
        }
        try {
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(SAVE_LOCATION_INTERVAL);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}
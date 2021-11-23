@java.lang.Override
public void run() {
    while (!(mIsStopThreads)) {
        if (mGPSListener.isGpsFixed()) {
            android.location.Location location = mGPSListener.getLocation();
            if (((mPrevLocation) != null) && ((haversineDistance(mPrevLocation, location)) >= (MIN_POINTS_STEP))) {
                mLocationQueue.add(location);
                mPrevLocation = location;
            }
        }
        try {
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(UPDATE_LOCATION_INTERVAL);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}
@java.lang.Override
public void run() {
    while ((!(mIsStopThreads)) || ((mLocationQueue.size()) != 0)) {
        while ((mLocationQueue.size()) != 0)
            mDBHelper.addPoint(mLocationQueue.poll());
        
        try {
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(SAVE_LOCATION_INTERVAL);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}
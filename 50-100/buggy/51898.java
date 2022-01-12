public void play(boolean updateState) {
    if ((rawDataManagerAsyncTask) != null) {
        rawDataManagerAsyncTask.stopAndWait();
        rawDataManagerAsyncTask = null;
    }
    rawDataManagerAsyncTask = new fr.isen.twinmx.async.RawDataManagerAsyncTask(mBluetooth.getDataManager(), this.dataSets);
    if (updateState)
        this.chartFragment.setPlaying(true);
    
    if ((Build.VERSION.SDK_INT) >= 11)
        rawDataManagerAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    else
        rawDataManagerAsyncTask.execute();
    
}
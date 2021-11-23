public void pause(boolean wait, boolean updateState) {
    if ((rawDataManagerAsyncTask) != null) {
        if (wait) {
            rawDataManagerAsyncTask.stopAndWait();
        }else {
            rawDataManagerAsyncTask.stop();
        }
        if (updateState)
            this.chartFragment.setPlaying(false);
        
    }
    rawDataManagerAsyncTask = null;
}
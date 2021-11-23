public void pause(boolean wait) {
    if ((rawDataManagerAsyncTask) != null) {
        if (wait) {
            rawDataManagerAsyncTask.stopAndWait();
        }else {
            rawDataManagerAsyncTask.stop();
        }
        this.chartFragment.setPlaying(false);
    }
    rawDataManagerAsyncTask = null;
}
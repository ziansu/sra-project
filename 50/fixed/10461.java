@java.lang.Override
public void onUploadError(fr.bmartel.speedtest.SpeedTestError speedTestError, java.lang.String errorMessage) {
    forceStopTask();
    timer.cancel();
    timer.purge();
}
private void stopTimer() {
    if ((timer) != null) {
        general.SLog.log(SLog.Debug, "LocationManager", "stop fixTimeout timer");
        timer.cancel();
    }
    timeout = false;
}
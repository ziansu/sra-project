public void stopScheduler() {
    timer.cancel();
    if ((scheduler) != null) {
        scheduler.cancel();
        scheduler = null;
    }
    try {
        transmitter.close();
    } catch (java.lang.Exception e) {
        de.rwth_aachen.afu.raspager.RasPagerService.log.log(java.util.logging.Level.SEVERE, "Failed to close transmitter.", e);
    }
}
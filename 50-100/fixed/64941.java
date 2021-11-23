protected synchronized void scheduleSessionMonitoring(long period) {
    if ((sessionMonitoringTask.get()) == null) {
        org.f1x.v1.SessionMonitoringTask timer = new org.f1x.v1.SessionMonitoringTask(this);
        org.f1x.util.timer.GlobalTimer.getInstance().schedule(timer, period, period);
        sessionMonitoringTask.set(timer);
    }else {
        org.f1x.v1.FixCommunicator.LOGGER.warn().append(this).append("Monitoring task already defined").commit();
    }
}
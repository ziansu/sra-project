private void shutdownMonitoringService() {
    if ((executor) != null) {
        java.util.logging.Logger.getLogger(fish.payara.jmx.monitoring.MonitoringService.class.getName()).log(java.util.logging.Level.INFO, "Monitoring Service will shutdown");
        executor.shutdownNow();
    }
}
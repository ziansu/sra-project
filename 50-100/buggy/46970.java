public void flush() {
    java.util.concurrent.Future<java.lang.Boolean> task = enqueueAndFlush(null, 0);
    if (task != null) {
        try {
            task.get();
        } catch (java.lang.InterruptedException e) {
            com.sensorsdata.analytics.javasdk.SensorsDataAPI.log.error(e.getMessage(), e);
        } catch (java.util.concurrent.ExecutionException e) {
            com.sensorsdata.analytics.javasdk.SensorsDataAPI.log.error(e.getMessage(), e);
        }
    }
}
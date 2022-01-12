@java.lang.Override
public void pollCycle() {
    long startTime = java.lang.System.currentTimeMillis();
    try {
        this.setDates();
        this.processApplication();
    } catch (java.lang.Exception e) {
        com.pbrant.instancegrouper.InstanceGrouper.logger.error(e);
    }
    long endTime = java.lang.System.currentTimeMillis();
    long duration = endTime - startTime;
    com.pbrant.instancegrouper.InstanceGrouper.logger.debug(("Duration (ms) = " + duration));
}
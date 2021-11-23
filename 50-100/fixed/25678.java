@org.junit.BeforeClass
public static void startScheduler() throws java.lang.Exception {
    java.lang.String ipAddress = com.containersolutions.mesoshelloworld.systemtest.DiscoverySystemTest.CLUSTER.getMasterContainer().getIpAddress();
    com.containersolutions.mesoshelloworld.systemtest.DiscoverySystemTest.log.info(("Starting Scheduler, connected to " + ipAddress));
    com.containersolutions.mesoshelloworld.systemtest.SchedulerContainer scheduler = new com.containersolutions.mesoshelloworld.systemtest.SchedulerContainer(ipAddress);
    com.containersolutions.mesoshelloworld.systemtest.DiscoverySystemTest.CLUSTER.addAndStartContainer(scheduler);
    com.containersolutions.mesoshelloworld.systemtest.DiscoverySystemTest.log.info(("Started Scheduler on " + (scheduler.getIpAddress())));
}
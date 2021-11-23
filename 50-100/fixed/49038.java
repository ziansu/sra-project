private void purgeInactiveDestinations() {
    org.apache.activemq.broker.region.RegionBroker regionBroker = ((org.apache.activemq.broker.region.RegionBroker) (broker.getRegionBroker()));
    com.google.common.base.Stopwatch stopwatch = new com.google.common.base.Stopwatch();
    stopwatch.start();
    java.lang.System.out.printf("=== STARTING QUEUE GC PURGE!\n");
    regionBroker.purgeInactiveDestinations();
    java.lang.System.out.printf("=============\n");
    java.lang.System.out.printf("Purged inactive destinations in : %s\n", stopwatch.stop());
}
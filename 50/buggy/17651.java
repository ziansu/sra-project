@org.rmatil.sync.event.aggregator.test.core.AfterClass
public static void tearDown() {
    org.rmatil.sync.event.aggregator.test.core.EventAggregatorTest.logger.debug("Stopping event aggregator");
    org.rmatil.sync.event.aggregator.test.core.EventAggregatorTest.eventAggregator.stop();
    org.rmatil.sync.event.aggregator.test.core.APathTest.tearDown();
}
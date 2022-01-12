@org.junit.Before
public void init() throws org.apache.nifi.reporting.InitializationException {
    runner = org.apache.nifi.util.TestRunners.newTestRunner(org.apache.nifi.processors.lookup.PutLookupTable.class);
    final org.apache.nifi.lookup.InMemoryLookupTableService service = new org.apache.nifi.lookup.InMemoryLookupTableService();
    runner.addControllerService("service id", service);
    runner.enableControllerService(service);
    runner.assertValid(service);
    runner.setProperty(org.apache.nifi.processors.lookup.PutLookupTable.PROP_LOOKUP_TABLE_SERVICE, "service id");
}
@com.hazelcast.simulator.test.annotations.Setup
public void setUp(com.hazelcast.simulator.test.TestContext testContext) throws java.lang.Exception {
    map = testContext.getTargetInstance().getMap((((basename) + "-") + (testContext.getTestId())));
    operationSelectorBuilder.addOperation(com.hazelcast.simulator.tests.map.multivalues.MultiValueMapTest.Operation.PUT, putProbability).addDefaultOperation(com.hazelcast.simulator.tests.map.multivalues.MultiValueMapTest.Operation.QUERY);
}
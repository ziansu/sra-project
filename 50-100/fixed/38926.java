@com.hazelcast.simulator.test.annotations.Setup
public void setUp(com.hazelcast.simulator.test.TestContext testContext) throws java.lang.Exception {
    targetInstance = testContext.getTargetInstance();
    this.mBeanServer = java.lang.management.ManagementFactory.getPlatformMBeanServer();
    this.name = new javax.management.ObjectName((((("com.hazelcast:instance=" + (targetInstance.getName())) + ",name=") + (targetInstance.getName())) + ",type=HazelcastInstance.PartitionServiceMBean"));
    operationSelectorBuilder.addOperation(com.hazelcast.simulator.tests.jmx.PartitionServiceMBeanTest.Operation.IsLocalMemberSafe, isLocalMemberSafeProb).addDefaultOperation(com.hazelcast.simulator.tests.jmx.PartitionServiceMBeanTest.Operation.IsClusterSafe);
}
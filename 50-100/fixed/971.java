public void initialize() throws java.io.FileNotFoundException, java.lang.ReflectiveOperationException {
    injector = com.google.inject.Guice.createInjector(baseModule);
    stateMgrAdaptor = createStateMgrAdaptor();
    this.runtime = com.twitter.heron.spi.common.Config.newBuilder().put(Key.SCHEDULER_STATE_MANAGER_ADAPTOR, stateMgrAdaptor).put(Key.TOPOLOGY_NAME, com.twitter.heron.spi.common.Context.topologyName(config)).build();
    this.schedulerClient = createSchedulerClient();
    this.policyConfigReader = createPolicyConfigReader();
    com.google.inject.AbstractModule commonModule = buildCommonConfigModule();
    injector = injector.createChildInjector(commonModule);
    initializePolicies();
}
public java.util.List<com.liveramp.cascading_ext.flow_step_strategy.FlowStepStrategyFactory<org.apache.hadoop.mapred.JobConf>> getDefaultFlowStepStrategies() {
    java.util.List<com.liveramp.cascading_ext.flow_step_strategy.FlowStepStrategyFactory<org.apache.hadoop.mapred.JobConf>> defaultStrategies = com.google.common.collect.Lists.newArrayList();
    defaultStrategies.add(new com.liveramp.cascading_ext.flow_step_strategy.SimpleFlowStepStrategyFactory(com.liveramp.cascading_ext.flow_step_strategy.RenameJobStrategy.class));
    defaultStrategies.add(new com.liveramp.cascading_ext.flow_step_strategy.SimpleFlowStepStrategyFactory(com.liveramp.cascading_ext.bloom.BloomAssemblyStrategy.class));
    return defaultFlowStepStrategies;
}
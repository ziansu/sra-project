public org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration createProcessEngineConfiguration(javax.sql.DataSource dataSource, org.springframework.transaction.PlatformTransactionManager transactionManager, org.camunda.bpm.engine.spring.components.jobexecutor.SpringJobExecutor springJobExecutor) throws java.io.IOException {
    org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration config = new org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration();
    config.setDataSource(new org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy(dataSource));
    config.setTransactionManager(transactionManager);
    if (springJobExecutor != null) {
        config.setJobExecutor(springJobExecutor);
        config.setJobExecutorActivate(true);
    }
    config.setDatabaseSchemaUpdate(camundaProperties.getDatabaseSchemaUpdate());
    camundaProperties.apply(config);
    return config;
}
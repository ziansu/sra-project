@java.lang.Override
protected void getServices(java.util.List<? super com.google.common.util.concurrent.Service> services) {
    services.add(injector.getInstance(org.apache.twill.zookeeper.ZKClientService.class));
    services.add(injector.getInstance(org.apache.twill.kafka.client.KafkaClientService.class));
    services.add(injector.getInstance(org.apache.twill.kafka.client.BrokerService.class));
    services.add(injector.getInstance(co.cask.cdap.api.metrics.MetricsCollectionService.class));
    services.add(injector.getInstance(co.cask.cdap.logging.framework.distributed.DistributedLogFramework.class));
    services.add(injector.getInstance(co.cask.cdap.logging.service.LogSaverStatusService.class));
}
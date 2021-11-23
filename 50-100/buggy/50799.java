@java.lang.Override
public void init() throws java.lang.Exception {
    super.init();
    controller2AnalysisQueue = incomingDataQueueFactory.createDefaultRabbitQueue(Constants.RABBIT_MQ_HOST_NAME_KEY);
    consumer = new com.rabbitmq.client.QueueingConsumer(controller2AnalysisQueue.channel);
    controller2AnalysisQueue.channel.basicConsume(controller2AnalysisQueue.name, false, consumer);
    controller2AnalysisQueue.channel.basicConsume(Constants.CONTROLLER_2_ANALYSIS_QUEUE_NAME, false, consumer);
    storage = org.hobbit.storage.client.StorageServiceClient.create(outgoingDataQueuefactory.getConnection());
    org.hobbit.analysis.AnalysisComponent.LOGGER.debug("Analysis Component Initialized!");
}
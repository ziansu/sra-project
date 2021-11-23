private void handleMessage(com.gboxsw.miniac.gateways.exec.Message message) {
    java.lang.String[] topicHierarchy = com.gboxsw.miniac.gateways.exec.Application.parseTopicHierarchy(message.getTopic());
    java.lang.String commandId = topicHierarchy[2];
    java.lang.String output = message.getContent();
    com.gboxsw.miniac.gateways.exec.ExecQueue.OutputConsumer outputConsumer;
    synchronized(lock) {
        outputConsumer = outputConsumers.get(commandId);
    }
    if (outputConsumer != null) {
        outputConsumer.handleOutput(output);
    }
}
@java.lang.Override
public void receiveMessage(com.google.pubsub.v1.PubsubMessage message, com.google.cloud.pubsub.spi.v1.AckReplyConsumer consumer) {
    de.hdm.wim.sharedLib.pubsub.receiver.FlinkReceiver.LOGGER.info("FlinkReceiver");
    de.hdm.wim.sharedLib.pubsub.receiver.FlinkReceiver.LOGGER.info(("Id : " + (message.getMessageId())));
    de.hdm.wim.sharedLib.pubsub.receiver.FlinkReceiver.LOGGER.info(("Data : " + (message.getData().toStringUtf8())));
    de.hdm.wim.sharedLib.pubsub.receiver.FlinkReceiver.LOGGER.info(("Attributes: " + (new com.google.gson.Gson().toJson(message.getAttributesMap()))));
    consumer.ack();
}
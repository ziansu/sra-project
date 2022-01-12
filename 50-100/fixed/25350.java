private void resetConsumer(java.lang.String reason, java.lang.Throwable t) {
    java.lang.String msg = reason;
    try {
        if ((consumerInstance) != null) {
            messageQueueProxyService.destroyConsumerInstance(consumerInstance);
        }
    } catch (java.lang.Throwable t1) {
        msg += "; Error while destroying consumer instance.";
    } finally {
        if (t != null) {
            com.ft.message.consumer.MessageQueueConsumer.LOGGER.error(java.lang.String.format("outcome=Exception message=\"%s\"", msg), t);
            consumerInstance = null;
            backOff();
        }
    }
}
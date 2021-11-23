public cn.com.hellowood.rocketmq.util.SendResult sendSynchronousMessage(cn.com.hellowood.rocketmq.util.Message message) {
    cn.com.hellowood.rocketmq.util.ProducerHelper.logger.info("MQ start send SYNCHRONOUS message ");
    long startTimestamp = java.lang.System.currentTimeMillis();
    message.setTopic(java.lang.String.valueOf(configProperties.getTopic()));
    cn.com.hellowood.rocketmq.util.SendResult sendResult = producer.send(message);
    long costTime = (java.lang.System.currentTimeMillis()) - startTimestamp;
    cn.com.hellowood.rocketmq.util.ProducerHelper.logger.info((("MQ completed send SYNCHRONOUS message in " + costTime) + " ms"));
    return sendResult;
}
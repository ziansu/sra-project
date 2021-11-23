public cn.com.hellowood.rocketmq.util.SendResult sendOneWayMessage(cn.com.hellowood.rocketmq.util.Message message) {
    cn.com.hellowood.rocketmq.util.ProducerHelper.logger.info("MQ start send ONE_WAY message ");
    long startTimestamp = java.lang.System.currentTimeMillis();
    producer.sendOneway(message);
    long costTime = (java.lang.System.currentTimeMillis()) - startTimestamp;
    cn.com.hellowood.rocketmq.util.ProducerHelper.logger.info((("MQ completed send ONE_WAY message in " + costTime) + " ms"));
    return null;
}
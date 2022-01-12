public void send(final com.alibaba.rocketmq.common.message.Message msg) {
    try {
        producer.send(msg, messageQueueSelector, new com.alibaba.rocketmq.client.producer.buffered.SendMessageCallback(this, sendCallback, msg));
    } catch (com.alibaba.rocketmq.client.exception.MQClientException | com.alibaba.rocketmq.remoting.exception.RemotingException | com.alibaba.rocketmq.client.exception.MQBrokerException | java.lang.InterruptedException e) {
        errorSendingCounter.incrementAndGet();
        try {
            messageQueue.offer(msg, 5, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException exception) {
            localMessageStore.stash(msg);
        }
    }
}
@org.junit.Test
public void testPop() throws java.lang.InterruptedException {
    com.alibaba.rocketmq.common.message.Message[] messages = com.alibaba.rocketmq.client.producer.concurrent.DefaultLocalMessageStoreTest.defaultLocalMessageStore.pop(2);
    while ((null != messages) && ((messages.length) > 0)) {
        for (com.alibaba.rocketmq.common.message.Message msg : messages) {
            java.lang.System.out.println(msg.getKeys());
        }
        messages = com.alibaba.rocketmq.client.producer.concurrent.DefaultLocalMessageStoreTest.defaultLocalMessageStore.pop(2);
    } 
    com.alibaba.rocketmq.client.producer.concurrent.DefaultLocalMessageStoreTest.defaultLocalMessageStore.close();
}
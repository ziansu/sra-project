@com.alibaba.rocketmq.client.store.Test
public void testStash() throws java.lang.Exception {
    com.alibaba.rocketmq.common.message.Message message = new com.alibaba.rocketmq.common.message.Message("Test", "Test123".getBytes());
    store.stash(message);
    com.alibaba.rocketmq.common.message.Message[] messages = store.pop(10);
    for (com.alibaba.rocketmq.common.message.Message msg : messages) {
        java.lang.System.out.println(msg);
        java.lang.System.out.println(new java.lang.String(msg.getBody(), "UTF-8"));
    }
}
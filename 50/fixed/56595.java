public void asyncSend(com.alibaba.rocketmq.common.message.Message m) {
    if ((sender) != null) {
        queue.add(m);
    }
}
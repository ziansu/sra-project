public void nextTuple() {
    com.alibaba.rocketmq.storm.domain.BatchMessage msgs = null;
    try {
        msgs = batchQueue.take();
    } catch (java.lang.InterruptedException e) {
        return ;
    }
    if (msgs == null) {
        return ;
    }
    java.util.UUID uuid = msgs.getBatchId();
    collector.emit(new backtype.storm.tuple.Values(msgs.getMsgList()), uuid);
}
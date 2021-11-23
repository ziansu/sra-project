@java.lang.Override
public boolean retryFurther(java.lang.Long offset) {
    org.apache.storm.kafka.ExponentialBackoffMsgRetryManager.MessageRetryRecord record = this.records.get(offset);
    return !(((record != null) && ((this.retryLimit) > 0)) && ((this.retryLimit) <= (record.retryNum)));
}
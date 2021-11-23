@java.lang.Override
public org.apache.kafka.common.errors.ApiException build(java.lang.String message) {
    return new org.apache.kafka.common.errors.ConcurrentTransactionsException(message);
}
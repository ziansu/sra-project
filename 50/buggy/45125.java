public void executeBulk(final org.elasticsearch.action.bulk.BulkRequest bulkRequest, final org.elasticsearch.action.ActionListener<org.elasticsearch.action.bulk.BulkResponse> listener) {
    final long startTimeNanos = relativeTime();
    executeBulk(bulkRequest, startTimeNanos, listener, new org.elasticsearch.common.util.concurrent.AtomicArray(bulkRequest.requests.size()));
}
@java.lang.Override
protected com.hazelcast.map.impl.query.AggregationResult reduce(java.util.Collection<com.hazelcast.map.impl.query.AggregationResult> results) {
    if (results.isEmpty()) {
        return com.hazelcast.client.impl.protocol.task.map.DefaultMapAggregateMessageTask.EMPTY_AGGREGATION_RESULT;
    }
    com.hazelcast.map.impl.query.AggregationResult combinedResult = null;
    try {
        for (com.hazelcast.map.impl.query.AggregationResult result : results) {
            if (combinedResult == null) {
                combinedResult = result;
            }else {
                combinedResult.combine(result);
            }
        }
    } finally {
        combinedResult.onCombineFinished();
    }
    return combinedResult;
}
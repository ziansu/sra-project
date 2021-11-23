private static void aggregate(java.util.Map<cc.blynk.server.storage.reporting.average.AggregationKey, cc.blynk.server.storage.reporting.average.AggregationValue> map, cc.blynk.server.storage.reporting.average.AggregationKey key, double value) {
    cc.blynk.server.storage.reporting.average.AggregationValue aggregationValue = map.get(key);
    if (aggregationValue == null) {
        final cc.blynk.server.storage.reporting.average.AggregationValue aggregationValueTmp = new cc.blynk.server.storage.reporting.average.AggregationValue();
        aggregationValue = map.putIfAbsent(key, aggregationValueTmp);
        if (aggregationValue == null) {
            aggregationValue = aggregationValueTmp;
        }
    }
    aggregationValue.update(value);
}
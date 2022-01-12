public void createIndex(K key, V value) {
    for (java.util.Map.Entry<java.lang.String, org.corfudb.runtime.collections.SMRMultiIndex.IndexSpecification> entry : indexSpecifications.entrySet()) {
        java.util.Collection index = getIndex(entry.getKey(), entry.getValue(), key, value);
        P projection = ((P) (entry.getValue().getProjectionFunction().generateProjection(key, value)));
        index.add(projection);
    }
}
public org.openstack4j.openstack.cloudeye.internal.MetricFilterOptions dim(java.lang.String[] dimValues) {
    java.util.Map<java.lang.String, java.lang.String> dimsMap = new java.util.HashMap<>();
    for (int i = 0; i < (dimValues.length); i++) {
        dimsMap.put(("dim." + i), dimValues[i]);
    }
    return addAll(dimsMap);
}
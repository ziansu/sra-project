private void init() {
    java.util.Collection<org.apache.drill.exec.proto.CoordinationProtos.DrillbitEndpoint> endpoints = storagePlugin.getContext().getBits();
    java.util.Map<java.lang.String, org.apache.drill.exec.proto.CoordinationProtos.DrillbitEndpoint> endpointMap = com.google.common.collect.Maps.newHashMap();
    for (org.apache.drill.exec.proto.CoordinationProtos.DrillbitEndpoint endpoint : endpoints) {
        endpointMap.put(endpoint.getAddress(), endpoint);
    }
}
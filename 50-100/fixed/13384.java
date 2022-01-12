@java.lang.Override
void handleResponse(org.apache.kafka.common.requests.AbstractResponse abstractResponse) {
    org.apache.kafka.common.requests.MetadataResponse response = ((org.apache.kafka.common.requests.MetadataResponse) (abstractResponse));
    describeClusterFuture.complete(response.brokers());
    org.apache.kafka.common.Node controller = null;
    if (((response.controller()) != null) && ((response.controller().id()) != (org.apache.kafka.common.requests.MetadataResponse.NO_CONTROLLER_ID)))
        controller = response.controller();
    
    controllerFuture.complete(controller);
    clusterIdFuture.complete(response.clusterId());
}
private void setReplicasForService(java.lang.String project, java.lang.String service, java.lang.Long replicas) {
    openShiftClient.inNamespace(project).deploymentConfigs().withName(service).edit().editSpec().withReplicas(replicas.intValue()).endSpec().done();
}
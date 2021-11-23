private void setReplicasForService(java.lang.String project, java.lang.String service, int replicas) {
    openShiftClient.inNamespace(project).deploymentConfigs().withName(service).edit().editSpec().withReplicas(replicas).endSpec().done();
}
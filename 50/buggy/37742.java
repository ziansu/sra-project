public void preExecute(org.apache.hadoop.yarn.api.records.ContainerId containerId, org.apache.hadoop.yarn.api.records.Resource containerResource) throws java.io.IOException {
    java.lang.System.out.println(containerResource.getMemory());
    setupLimits(containerId, containerResource);
}
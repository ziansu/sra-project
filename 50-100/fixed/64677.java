private void addInstancesToMapping(java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> hostPortMapping, java.util.Collection<java.lang.String> tasksArns) {
    for (java.lang.String taskArn : tasksArns) {
        java.lang.String containerInstanceArn = taskToContainerInstanceMapping.get(taskArn);
        java.lang.String ec2Id = containerInstanceArnEc2Mapping.get(containerInstanceArn);
        java.lang.String privateIpAddress = ec2InstanceIpMapping.get(ec2Id);
        java.util.List<java.lang.Integer> ports = taskPortMapping.get(taskArn);
        hostPortMapping.put(privateIpAddress, ports);
    }
}
public com.amazonaws.services.ec2.model.Instance getInstanceById(java.lang.String instanceId) {
    if (instanceId == null) {
        logger.warn("instanceId is null");
        return null;
    }
    com.amazonaws.services.ec2.model.DescribeInstancesRequest request = new com.amazonaws.services.ec2.model.DescribeInstancesRequest();
    request.withInstanceIds(instanceId);
    com.amazonaws.services.ec2.model.DescribeInstancesResult result = amazonEC2Client.describeInstances(request);
    return result.getReservations().get(0).getInstances().get(0);
}
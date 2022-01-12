public void deregisterInstancesFromLoadBalancer(java.lang.String loadBalancerName, java.util.List<org.apache.stratos.aws.extension.Instance> instances, java.lang.String region) {
    org.apache.stratos.aws.extension.AWSHelper.log.info(((("Detaching instance " + (instances.get(0))) + " from load balancer + ") + loadBalancerName));
    org.apache.stratos.aws.extension.DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest = new org.apache.stratos.aws.extension.DeregisterInstancesFromLoadBalancerRequest(loadBalancerName, instances);
    try {
        elbClient.setEndpoint(java.lang.String.format(Constants.ELB_ENDPOINT_URL_FORMAT, region));
        elbClient.deregisterInstancesFromLoadBalancer(deregisterInstancesFromLoadBalancerRequest);
    } catch (com.amazonaws.AmazonClientException e) {
        org.apache.stratos.aws.extension.AWSHelper.log.error(("Could not de-register instances from load balancer " + loadBalancerName), e);
    }
}
public void registerInstancesToLoadBalancer(java.lang.String loadBalancerName, java.util.List<org.apache.stratos.aws.extension.Instance> instances, java.lang.String region) {
    org.apache.stratos.aws.extension.AWSHelper.log.info(((("Attaching instance " + (instances.get(0))) + " to load balancer + ") + loadBalancerName));
    org.apache.stratos.aws.extension.RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest = new org.apache.stratos.aws.extension.RegisterInstancesWithLoadBalancerRequest(loadBalancerName, instances);
    try {
        elbClient.setEndpoint(java.lang.String.format(Constants.ELB_ENDPOINT_URL_FORMAT, region));
        elbClient.registerInstancesWithLoadBalancer(registerInstancesWithLoadBalancerRequest);
    } catch (com.amazonaws.AmazonClientException e) {
        org.apache.stratos.aws.extension.AWSHelper.log.error(("Could not register instances to load balancer " + loadBalancerName), e);
    }
}
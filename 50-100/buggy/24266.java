private void destroyLoadBalancer() {
    if (((app.getInstancesNeeded()) <= 1) || (!(useCloudML)))
        return ;
    
    if ((loadBalancer) == null)
        throw new java.lang.RuntimeException("You've still to create a load balancer!");
    
    it.cloud.amazon.elb.ElasticLoadBalancing.deleteLoadBalancer(loadBalancer);
    loadBalancer = null;
}
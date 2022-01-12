private void createLoadBalancer() {
    if (((app.getInstancesNeeded()) <= 1) || (!(useCloudML)))
        return ;
    
    if ((loadBalancer) != null)
        throw new java.lang.RuntimeException("You've already created a load balancer!");
    
    loadBalancer = (it.polimi.modaclouds.scalingsdatests.Test.LB_BASENAME) + (org.apache.commons.lang.RandomStringUtils.randomNumeric(3));
    it.cloud.amazon.elb.ElasticLoadBalancing.createNewLoadBalancer(loadBalancer, new it.cloud.amazon.elb.ElasticLoadBalancing.Listener("HTTP", java.lang.Integer.parseInt(app.getParameter("PORT"))));
}
@org.junit.Test
public void testListLBReturnsEmptyArrayWhenNullProfilesAreRetrieved() throws org.dasein.cloud.CloudException, org.dasein.cloud.InternalException {
    new org.dasein.cloud.azure.tests.network.NonStrictExpectations(lbSupport) {
        {
            mockit.Deencapsulation.invoke(lbSupport, "getProfiles");
            result = null;
            times = 1;
        }
    };
    java.lang.Iterable<org.dasein.cloud.azure.tests.network.LoadBalancer> loadBalancers = lbSupport.listLoadBalancers();
    int actualCount = 0;
    while (loadBalancers.iterator().hasNext()) {
        actualCount++;
        loadBalancers.iterator().next();
    } 
    assertEquals(0, actualCount);
}
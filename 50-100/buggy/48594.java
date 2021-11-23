@org.junit.Test
public void shouldSetAccountIdAndLbIdForHealthMonitorResource() {
    org.openstack.atlas.api.resources.HealthMonitorResource healthMonitorResource = org.mockito.Mockito.mock(org.openstack.atlas.api.resources.HealthMonitorResource.class);
    loadBalancerResource.setHealthMonitorResource(healthMonitorResource);
    loadBalancerResource.retrieveHealthMonitorResource();
    org.mockito.Mockito.verify(healthMonitorResource).setAccountId(org.mockito.Matchers.anyInt());
    org.mockito.Mockito.verify(healthMonitorResource).setLoadBalancerId(org.mockito.Matchers.anyInt());
}
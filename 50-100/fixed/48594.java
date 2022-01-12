@org.junit.Test
public void shouldSetAccountIdAndLbIdForHealthMonitorResource() {
    org.openstack.atlas.api.resources.HealthMonitorResource healthMonitorResource = mock(org.openstack.atlas.api.resources.HealthMonitorResource.class);
    loadBalancerResource.setHealthMonitorResource(healthMonitorResource);
    loadBalancerResource.retrieveHealthMonitorResource();
    verify(healthMonitorResource).setAccountId(org.mockito.Matchers.anyInt());
    verify(healthMonitorResource).setLoadBalancerId(org.mockito.Matchers.anyInt());
}
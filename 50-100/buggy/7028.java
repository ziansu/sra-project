@org.junit.Before
public void standUp() {
    loadBalancerService = org.mockito.Mockito.mock(org.openstack.atlas.service.domain.services.LoadBalancerService.class);
    reverseProxyLoadBalancerService = org.mockito.Mockito.mock(org.openstack.atlas.api.integration.ReverseProxyLoadBalancerService.class);
    asyncService = org.mockito.Mockito.mock(org.openstack.atlas.api.integration.AsyncService.class);
    loadBalancerResource = new org.openstack.atlas.api.resources.LoadBalancerResource();
    loadBalancerResource.setId(1);
    loadBalancerResource.setAccountId(1234);
    loadBalancerResource.setLoadBalancerService(loadBalancerService);
    loadBalancerResource.setAsyncService(asyncService);
}
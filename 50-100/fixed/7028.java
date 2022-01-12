@org.junit.Before
public void standUp() {
    loadBalancerService = mock(org.openstack.atlas.service.domain.services.LoadBalancerService.class);
    reverseProxyLoadBalancerService = mock(org.openstack.atlas.api.integration.ReverseProxyLoadBalancerService.class);
    asyncService = mock(org.openstack.atlas.api.integration.AsyncService.class);
    loadBalancerResource = new org.openstack.atlas.api.resources.LoadBalancerResource();
    loadBalancerResource.setId(1);
    loadBalancerResource.setAccountId(1234);
    loadBalancerResource.setLoadBalancerService(loadBalancerService);
    loadBalancerResource.setAsyncService(asyncService);
}
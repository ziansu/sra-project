@java.lang.Override
public void uploadDefaultErrorFile(org.openstack.atlas.adapter.LoadBalancerEndpointConfiguration config, java.lang.String content) throws java.rmi.RemoteException, org.openstack.atlas.adapter.exceptions.InsufficientRequestException {
    org.openstack.atlas.adapter.zxtm.ZxtmServiceStubs serviceStubs = null;
    serviceStubs = getServiceStubs(config);
    org.openstack.atlas.adapter.zxtm.ConfExtraBindingStub extraService = null;
    org.openstack.atlas.adapter.zxtm.ZxtmAdapterImpl.LOG.debug("Attempting to upload the default error file...");
    extraService = serviceStubs.getZxtmConfExtraBinding();
    if (extraService != null) {
        extraService.writeFile(new java.lang.String[]{ org.openstack.atlas.service.domain.util.Constants.DEFAULT_ERRORFILE }, new java.lang.String[]{ content.toString() });
        org.openstack.atlas.adapter.zxtm.ZxtmAdapterImpl.LOG.info("Successfully uploaded the default error file...");
    }
}
protected void setup() {
    loadProperties();
    vnfmManagerEndpoint = new org.openbaton.catalogue.nfvo.VnfmManagerEndpoint();
    vnfmManagerEndpoint.setType(this.type);
    vnfmManagerEndpoint.setDescription(this.description);
    vnfmManagerEndpoint.setEnabled(this.enabled);
    vnfmManagerEndpoint.setActive(true);
    vnfmManagerEndpoint.setEndpoint(this.endpoint);
    org.openbaton.common.vnfm_sdk.AbstractVnfm.log.debug(("creating VnfmManagerEndpoint for vnfm endpointType: " + (this.endpointType)));
    vnfmManagerEndpoint.setEndpointType(org.openbaton.catalogue.nfvo.EndpointType.valueOf(this.endpointType));
}
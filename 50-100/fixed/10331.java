@java.lang.Override
@javax.jws.WebMethod(exclude = true)
public void setState(java.net.URI nodeInstanceID, javax.xml.namespace.QName state) throws org.opentosca.instancedata.service.ReferenceNotFoundException {
    java.util.List<org.opentosca.model.instancedata.NodeInstance> nodeInstances = this.niDAO.getNodeInstances(null, null, null, nodeInstanceID);
    if ((nodeInstances == null) || ((nodeInstances.size()) != 1)) {
        java.lang.String msg = java.lang.String.format("Failed to set State of NodeInstance: '%s' - does it exist?", nodeInstanceID);
        org.opentosca.instancedata.service.impl.InstanceDataServiceImpl.LOG.warn(msg);
        throw new org.opentosca.instancedata.service.ReferenceNotFoundException(msg);
    }
    this.niDAO.setState(nodeInstances.get(0), state);
}
@java.lang.Override
@javax.jws.WebMethod(exclude = true)
public javax.xml.namespace.QName getState(java.net.URI nodeInstanceID) throws org.opentosca.instancedata.service.ReferenceNotFoundException {
    java.util.List<org.opentosca.model.instancedata.NodeInstance> nodeInstances = niDAO.getNodeInstances(null, null, null, nodeInstanceID);
    if ((nodeInstances == null) || ((nodeInstances.size()) != 1)) {
        java.lang.String msg = java.lang.String.format("Failed to get State of NodeInstance: '%s' - does it exist?", nodeInstanceID);
        org.opentosca.instancedata.service.impl.InstanceDataServiceImpl.LOG.warn(msg);
        throw new org.opentosca.instancedata.service.ReferenceNotFoundException(msg);
    }
    return nodeInstances.get(0).getState();
}
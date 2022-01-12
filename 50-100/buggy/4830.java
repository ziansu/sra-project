@java.lang.Override
@javax.jws.WebMethod(exclude = true)
public org.w3c.dom.Document getServiceInstanceProperties(java.net.URI serviceInstanceID, java.util.List<javax.xml.namespace.QName> propertiesList) throws org.opentosca.instancedata.service.ReferenceNotFoundException {
    java.util.List<org.opentosca.model.instancedata.ServiceInstance> serviceInstances = getServiceInstances(serviceInstanceID, null, null);
    if ((serviceInstances == null) || ((serviceInstances.size()) != 1)) {
        java.lang.String msg = java.lang.String.format("Failed to retrieve ServiceInstance: '%s'", serviceInstanceID);
        org.opentosca.instancedata.service.impl.InstanceDataServiceImpl.LOG.warn(msg);
        throw new org.opentosca.instancedata.service.ReferenceNotFoundException(msg);
    }
    org.opentosca.model.instancedata.ServiceInstance serviceInstance = serviceInstances.get(0);
    return serviceInstance.getProperties();
}
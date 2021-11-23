@java.lang.Override
public org.cloudfoundry.client.lib.domain.CloudServiceInstance getServiceInstance(org.cloudfoundry.client.lib.domain.CloudSpace space, java.lang.String serviceName) {
    java.util.Map<java.lang.String, java.lang.Object> resource = doGetServiceInstance(sessionSpace, serviceName, 1);
    if (resource == null) {
        return null;
    }
    return resourceMapper.mapResource(resource, org.cloudfoundry.client.lib.domain.CloudServiceInstance.class);
}
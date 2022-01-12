public static boolean isNoopService(io.cattle.platform.core.model.Service service, io.cattle.platform.allocator.service.AllocatorService allocatorService) {
    java.lang.Object imageUUID = io.cattle.platform.servicediscovery.api.util.ServiceDiscoveryUtil.getServiceDataAsMap(service, ServiceDiscoveryConstants.PRIMARY_LAUNCH_CONFIG_NAME, allocatorService).get(InstanceConstants.FIELD_IMAGE_UUID);
    return ((service.getSelectorContainer()) != null) && ((imageUUID == null) || (imageUUID.toString().equalsIgnoreCase(ServiceDiscoveryConstants.IMAGE_NONE)));
}
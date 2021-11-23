@java.lang.Override
public com.emc.storageos.api.service.impl.resource.blockingestorchestration.context.VolumeIngestionContext getVolumeContext(java.lang.String unmanagedVolumeGuid) {
    return getProcessedUnManagedVolumeMap().get(unmanagedVolumeGuid);
}
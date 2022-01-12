@java.lang.Override
public com.emc.storageos.api.service.impl.resource.blockingestorchestration.context.VolumeIngestionContext getVolumeContext(java.lang.String unmanagedVolumeGuid) {
    if ((getProcessedUnManagedVolumeMap().get(unmanagedVolumeGuid)) != null) {
        getProcessedUnManagedVolumeMap().get(unmanagedVolumeGuid);
    }
    return getVolumeContext();
}
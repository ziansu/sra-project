public static boolean isVplexBackendVolume(com.emc.storageos.db.client.model.UnManagedDiscoveredObjects.UnManagedVolume volume) {
    if ((null == volume) || (null == (volume.getVolumeCharacterstics()))) {
        return false;
    }
    java.lang.String status = volume.getVolumeCharacterstics().get(SupportedVolumeCharacterstics.IS_VPLEX_BACKEND_VOLUME.toString());
    return com.emc.storageos.api.service.impl.resource.utils.VolumeIngestionUtil.TRUE.equals(status);
}
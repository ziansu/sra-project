protected org.ovirt.engine.core.common.businessentities.StorageDomain getStorageDomain() {
    if ((storageDomain) == null) {
        storageDomain = getDbFacade().getStorageDomainDao().get(getProfile().getStorageDomainId());
    }
    return storageDomain;
}
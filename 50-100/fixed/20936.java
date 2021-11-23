protected boolean checkStorageDomainStatus(final org.ovirt.engine.core.common.businessentities.StorageDomainStatus... statuses) {
    boolean valid = false;
    org.ovirt.engine.core.common.businessentities.StorageDomainStatus status = getStorageDomainStatus();
    if (status != null) {
        valid = java.util.Arrays.asList(statuses).contains(status);
    }
    if (!valid) {
        if ((status != null) && (status.isStorageDomainInProcess())) {
            return failCanDoAction(EngineMessage.ACTION_TYPE_FAILED_OBJECT_LOCKED);
        }
        addStorageDomainStatusIllegalMessage();
    }
    return valid;
}
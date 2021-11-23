private org.ovirt.engine.core.bll.ValidationResult hostExist() {
    if ((host) == null) {
        return new org.ovirt.engine.core.bll.ValidationResult(org.ovirt.engine.core.common.errors.VdcBllMessages.ACTION_TYPE_FAILED_HOST_NOT_EXIST, host.getName());
    }
    return org.ovirt.engine.core.bll.ValidationResult.VALID;
}
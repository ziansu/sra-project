@java.lang.Override
protected org.ovirt.engine.core.common.businessentities.VMStatus getRawValue(org.ovirt.engine.core.common.businessentities.VM object) {
    final org.ovirt.engine.core.common.businessentities.VDS vds = getDetailModel().getEntity();
    if (((object.getStatus().equals(VMStatus.MigratingFrom)) && (vds != null)) && (vds.getId().equals(object.getMigratingToVds()))) {
        return org.ovirt.engine.core.common.businessentities.VMStatus.MigratingTo;
    }
    return object.getStatus();
}
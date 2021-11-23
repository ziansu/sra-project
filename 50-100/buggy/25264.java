public void setStorageIOControl(com.vmware.vim25.mo.Datastore datastore, java.lang.Boolean enabled) {
    if (enabled != null) {
        if (datastore.getCapability().storageIORMSupported) {
            com.emc.sa.service.vipr.ViPRExecutionUtils.execute(new com.emc.sa.service.vmware.block.tasks.SetStorageIOControl(datastore, enabled));
        }else {
            com.emc.sa.service.vipr.ViPRExecutionUtils.logWarn("vmware.support.storage.io.control.not.supported", datastore.getName());
        }
    }
}
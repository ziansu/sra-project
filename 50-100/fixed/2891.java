@java.lang.Override
protected void executeQueryCommand() {
    setReturnValue(org.ovirt.engine.core.dal.dbbroker.DbFacade.getInstance().getDiskDao().getAllAttachableDisksByPoolId(org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getParameters().getStoragePoolId(), org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getParameters().getVmId(), org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getUserID(), org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getParameters().isFiltered()));
}
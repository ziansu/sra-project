@java.lang.Override
protected void executeQueryCommand() {
    java.util.List<org.ovirt.engine.core.common.businessentities.storage.Disk> diskList = org.ovirt.engine.core.dal.dbbroker.DbFacade.getInstance().getDiskDao().getAllAttachableDisksByPoolId(org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getParameters().getStoragePoolId(), org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getParameters().getVmId(), org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getUserID(), org.ovirt.engine.core.bll.storage.disk.GetAllAttachableDisksForVmQuery.getParameters().isFiltered());
    if (org.apache.commons.collections.CollectionUtils.isEmpty(diskList)) {
        setReturnValue(diskList);
        return ;
    }
    setReturnValue(diskList);
}
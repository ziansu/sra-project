@java.lang.Override
public com.emc.storageos.db.client.model.ExportMask refreshExportMask(com.emc.storageos.db.client.model.StorageSystem storage, com.emc.storageos.db.client.model.ExportMask mask) throws com.emc.storageos.exceptions.DeviceControllerException {
    return xtremioExportOperationHelper.refreshExportMask(storage, mask);
}
@java.lang.Override
public com.emc.storageos.db.client.model.ExportMask refreshExportMask(com.emc.storageos.db.client.model.StorageSystem storage, com.emc.storageos.db.client.model.ExportMask mask) throws com.emc.storageos.exceptions.DeviceControllerException {
    xtremioExportOperationHelper.refreshExportMask(storage, mask);
    return mask;
}
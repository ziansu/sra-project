@java.lang.Override
public java.lang.Void runInTransaction() {
    hostDeviceDao.saveAllInBatch(newDevices);
    hostDeviceDao.updateAllInBatch(changedDevices);
    hostDeviceDao.removeAllInBatch(removedDevices);
    handleHostNicVfsConfigUpdate();
    vmDeviceDao.removeAllInBatch(removedVmDevices);
    return null;
}
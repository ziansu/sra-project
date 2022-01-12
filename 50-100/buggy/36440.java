private void UpdateTotalDiskSize() {
    java.lang.Integer available = getStorageDynamicData().getAvailableDiskSize();
    java.lang.Integer used = getStorageDynamicData().getUsedDiskSize();
    if ((available != null) && (used != null)) {
        setTotalDiskSize((available + used));
    }else {
        setTotalDiskSize(null);
    }
}
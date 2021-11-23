private void UpdateTotalDiskSize() {
    java.lang.Integer available = ((getStorageDynamicData()) == null) ? null : getStorageDynamicData().getAvailableDiskSize();
    java.lang.Integer used = ((getStorageDynamicData()) == null) ? null : getStorageDynamicData().getUsedDiskSize();
    if ((available != null) && (used != null)) {
        setTotalDiskSize((available + used));
    }else {
        setTotalDiskSize(null);
    }
}
@java.lang.Override
protected com.emc.storageos.db.client.model.FileShare.MirrorStatus getFileMirrorStatusForSuccess(com.emc.storageos.db.client.model.FileShare fs) {
    if (fs.getStorageDevice().equals(getStorageUri())) {
        return com.emc.storageos.db.client.model.FileShare.MirrorStatus.FAILED_OVER;
    }else {
        return com.emc.storageos.db.client.model.FileShare.MirrorStatus.UNKNOWN;
    }
}
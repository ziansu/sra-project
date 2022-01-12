private void handleBase(org.zstack.storage.primary.DownloadIsoToPrimaryStorageMsg msg) {
    checkIfBackupStorageAttachedToMyZone(msg.getIsoSpec().getSelectedBackupStorage().getBackupStorageUuid());
    checkImageIfNeedToDownload(msg);
    handle(msg);
}
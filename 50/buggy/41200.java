private void handleBase(org.zstack.storage.primary.DownloadIsoToPrimaryStorageMsg msg) {
    checkIfBackupStorageAttachedToMyZone(msg.getIsoSpec().getSelectedBackupStorage().getBackupStorageUuid());
    checkImageIfNeedToDownload(msg.getIsoSpec().getInventory().getUuid());
    handle(msg);
}
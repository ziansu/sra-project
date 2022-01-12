private void validate(org.zstack.storage.primary.nfs.APIAddNfsPrimaryStorageMsg msg) {
    new org.zstack.storage.primary.nfs.NfsApiParamChecker().checkUrl(msg.getZoneUuid(), msg.getUrl());
}
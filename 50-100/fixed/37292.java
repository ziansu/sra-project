public void startUpload(java.util.List<java.io.File> contentItems) {
    org.duracloud.upload.Uploader.log.info((("Starting Upload with " + (contentItems.size())) + " items."));
    org.duracloud.sync.endpoint.SyncEndpoint syncEndpoint = new org.duracloud.sync.endpoint.DuraStoreChunkSyncEndpoint(contentStore, username, spaceId, false, false, 1073741824);
    syncManager = new org.duracloud.sync.mgmt.SyncManager(contentItems, syncEndpoint, 3, 10000);
    syncManager.beginSync();
    dirWalker = org.duracloud.sync.walker.DirWalker.start(contentItems);
    statusManager = org.duracloud.sync.mgmt.StatusManager.getInstance();
}
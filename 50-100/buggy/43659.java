protected boolean isInErrorState(java.nio.file.Path filePath) {
    while (true) {
        filePath = filePath.getParent();
        if (filePath == null) {
            return false;
        }
        com.liferay.sync.engine.model.SyncFile syncFile = com.liferay.sync.engine.service.SyncFileService.fetchSyncFile(filePath.toString());
        if (syncFile == null) {
            continue;
        }
        if ((!(syncFile.isSystem())) && ((syncFile.getState()) == (com.liferay.sync.engine.model.SyncFile.STATE_ERROR))) {
            return true;
        }
        return false;
    } 
}
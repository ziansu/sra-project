protected boolean isInErrorState(java.nio.file.Path filePath) {
    while (true) {
        if (filePath == null) {
            return false;
        }
        com.liferay.sync.engine.model.SyncFile syncFile = com.liferay.sync.engine.service.SyncFileService.fetchSyncFile(filePath.toString());
        if (syncFile != null) {
            if (syncFile.isSystem()) {
                break;
            }
            if ((syncFile.getState()) == (com.liferay.sync.engine.model.SyncFile.STATE_ERROR)) {
                return true;
            }
        }
        filePath = filePath.getParent();
    } 
    return false;
}
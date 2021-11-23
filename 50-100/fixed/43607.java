public com.wm.remusic.downmusic.DownloadTask.Builder setDBEntity(com.wm.remusic.downmusic.DownloadDBEntity dbEntity) {
    this.dbEntity = dbEntity;
    downloadStatus = dbEntity.getDownloadStatus();
    url = dbEntity.getUrl();
    id = dbEntity.getDownloadId();
    fileName = dbEntity.getFileName();
    art = dbEntity.getArtist();
    saveDirPath = dbEntity.getSaveDirPath();
    completedSize = dbEntity.getCompletedSize();
    totalSize = dbEntity.getTotalSize();
    return this;
}
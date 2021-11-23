void notifyDownloadStatus(final com.lcjian.lib.download.ChunkDownloadStatus status) {
    download.execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            chunkDownloadStatus = status;
            persistenceAdapter.saveChunkDownloadStatus(request, chunk, chunkDownloadStatus);
            for (com.lcjian.lib.download.ChunkDownloadListener chunkDownloadListener : listeners) {
                chunkDownloadListener.onDownloadStatusChanged(com.lcjian.lib.download.ChunkDownload.this, chunkDownloadStatus);
            }
            download.notifyDownloadStatus(chunkDownloadStatus);
        }
    });
}
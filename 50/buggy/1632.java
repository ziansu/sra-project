public void resetPoolSize() {
    initDownloadPool();
    com.milanix.example.downloader.service.DownloadService.executor.setCorePoolSize(com.milanix.example.downloader.service.DownloadService.downloadPoolSize);
    com.milanix.example.downloader.service.DownloadService.executor.setMaximumPoolSize(((com.milanix.example.downloader.service.DownloadService.downloadPoolSize) * (com.milanix.example.downloader.service.DownloadService.POOL_MAX_MULTIPLIER)));
}
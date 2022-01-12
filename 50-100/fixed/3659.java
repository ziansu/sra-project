public void downloadAll(com.atlauncher.workers.InstanceInstaller installer) {
    java.util.concurrent.ExecutorService executor = com.atlauncher.utils.Utils.generateDownloadExecutor();
    synchronized(this) {
        for (com.atlauncher.data.Downloadable dl : this) {
            executor.execute(new com.atlauncher.collection.DownloadPool.Installer(dl, installer));
        }
    }
    executor.shutdown();
    if (this.wait) {
        while (!(executor.isTerminated())) {
        } 
    }
}
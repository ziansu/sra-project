public void cancelDownloading(fr.uha.ensisa.jadoma.model.Download download) {
    if (download != null) {
        fr.uha.ensisa.jadoma.model.DownloadThread tmp = this.listDownloadThreads.get(this.listDownloads.indexOf(download));
        if (tmp.isRunning)
            tmp.interrupt();
        
        new java.io.File(download.getFileDestination()).delete();
        download.setEndDate(new java.util.Date());
        download.setCurrentState(DownloadState.CANCELED);
    }
}
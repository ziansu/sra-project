void manageOngoingDownloads() {
    for (java.lang.Thread t : fileTransporter.ongoingDownloadThreads.keySet()) {
        com.nitdgp.arka.psync.FileTransporter.ResumeDownloadThread downloadRunnable = fileTransporter.ongoingDownloadThreads.get(t);
        if (downloadRunnable.isRunning) {
            fileManager.setEndSequence(downloadRunnable.fileID, downloadRunnable.getPresentByte());
        }else {
            fileManager.setEndSequence(downloadRunnable.fileID, downloadRunnable.getPresentByte());
            fileTransporter.ongoingDownloadThreads.remove(t);
        }
    }
}
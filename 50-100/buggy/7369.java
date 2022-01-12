protected java.lang.Long doInBackground(com.androidexpansion.filedownloader.DownloadExtraAssets[] remoteLocalResources) {
    int count = remoteLocalResources.length;
    long totalSize = 0;
    for (int i = count - 1; i >= 0; i--) {
        totalSize += downloadExtraAssets.downloadFile(remoteLocalResources[i]);
        java.lang.Integer progress = ((int) ((i / ((float) (count))) * 100));
        publishProgress(progress);
        if (isCancelled())
            break;
        
    }
    return totalSize;
}
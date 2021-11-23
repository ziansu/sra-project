protected java.lang.Long doInBackground(com.androidexpansion.filedownloader.DownloadExtraAssets[] remoteLocalResources) {
    int count = remoteLocalResources.length;
    long totalSize = 0;
    for (int i = 0; i < count; i++) {
        totalSize += downloadExtraAssets.downloadFile(remoteLocalResources[i]);
        java.lang.Integer progress = ((int) (((i + 1) / ((float) (count))) * 100));
        publishProgress(progress);
        if (isCancelled())
            break;
        
    }
    return totalSize;
}
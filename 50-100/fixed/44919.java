public void startDownload(java.lang.String hostUrl, org.json.JSONArray jsonUrlArray) {
    com.androidexpansion.filedownloader.DownloadExtraAssets downloadExtraAssets;
    com.androidexpansion.filedownloader.DownloadFilesTask downloadFilesTask;
    downloadExtraAssets = new com.androidexpansion.filedownloader.DownloadExtraAssets(jsonUrlArray, hostUrl, cordova.getActivity().getApplicationContext());
    downloadFilesTask = new com.androidexpansion.filedownloader.DownloadFilesTask(downloadExtraAssets, this);
    downloadFilesTask.execute(downloadExtraAssets.localRemoteResources);
}
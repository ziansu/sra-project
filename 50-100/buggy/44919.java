public void startDownload(java.lang.String hostUrl, org.json.JSONArray jsonUrlArray) {
    java.lang.String fileUrl = "/cars/mustang2015/geometry/Geometry_305_v6_fb_coupe_frontlightbulb1_a001.b3d.dflr";
    java.lang.String fileUrl2 = "/spritesheets/gameplayUi.json";
    com.androidexpansion.filedownloader.DownloadExtraAssets downloadExtraAssets;
    com.androidexpansion.filedownloader.DownloadFilesTask downloadFilesTask;
    java.lang.String[] urls;
    downloadExtraAssets = new com.androidexpansion.filedownloader.DownloadExtraAssets(jsonUrlArray, hostUrl, cordova.getActivity().getApplicationContext());
    downloadFilesTask = new com.androidexpansion.filedownloader.DownloadFilesTask(downloadExtraAssets, this);
    downloadFilesTask.execute(downloadExtraAssets.localRemoteResources);
}
private void simpleLaunch() {
    downloadData = new com.dagerler001.artistslist.data_manager.DownloadCache(context);
    try {
        data = downloadData.loadData();
        message = downloadData.getMassege();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        error = downloadData.getError();
    }
}
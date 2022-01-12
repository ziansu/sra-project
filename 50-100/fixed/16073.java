private void simpleLaunch() {
    downloadData = new com.dagerler001.artistslist.data_manager.DownloadCache(context);
    try {
        data = downloadData.loadData();
        message = downloadData.getMassege();
        error = downloadData.getError();
    } catch (java.io.IOException e) {
        error = downloadData.getError();
        e.printStackTrace();
    }
}
private void downloadDate() {
    if (checkNetwork()) {
        downloadImage();
        downloadAppInfo();
    }else {
        showNetErrorDialog();
    }
}
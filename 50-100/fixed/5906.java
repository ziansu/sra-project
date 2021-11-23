public double calculateUploadSpeed(java.lang.String uploadUrl) {
    httpInvoker.config().setUrl(uploadUrl);
    com.astronlab.ngenhttplib.http.extended.UploadFileWithProgressListener uploadTester = new com.astronlab.ngenhttplib.http.extended.UploadFileWithProgressListener(httpInvoker, this);
    uploadSpeedManager = new com.astronlab.ngenhttplib.http.extended.SpeedManager(uploadTester);
    if ((uploadFileSize) > 0) {
        uploadTester.setUploadSizeInKB(uploadFileSize);
    }
    uploadTester.startUploadSpeedTest();
    return uploadSpeedManager.getSpeed();
}
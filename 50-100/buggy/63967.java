public synchronized void controlFree(final int num) {
    logger.info(("maxFree was = " + (jd.plugins.hoster.UploadCloudPro.maxFree.get())));
    jd.plugins.hoster.UploadCloudPro.maxFree.set(java.lang.Math.min(java.lang.Math.max(1, jd.plugins.hoster.UploadCloudPro.maxFree.addAndGet(num)), jd.plugins.hoster.UploadCloudPro.totalMaxSimultanFreeDownload.get()));
    logger.info(("maxFree now = " + (jd.plugins.hoster.UploadCloudPro.maxFree.get())));
}
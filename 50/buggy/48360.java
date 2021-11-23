private void onDownloaderFail(us.codecraft.webmagic.Request request) {
    if ((site.getCycleRetryTimes()) == 0) {
        sleep(site.getSleepTime());
    }else {
        doCycleRetry(request);
    }
    onError(request);
}
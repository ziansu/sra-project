void setIsPreload(java.lang.String url) {
    this.isPreload = true;
    this.srcUrl = this.srcUrl = statistics.srcUrl = url.trim();
    if (com.tencent.sonic.sdk.SonicUtils.shouldLog(Log.INFO)) {
        com.tencent.sonic.sdk.SonicUtils.log(com.tencent.sonic.sdk.SonicSession.TAG, Log.INFO, (((("session(" + (sId)) + ") is preload, new url=") + url) + "."));
    }
}
void setIsPreload(java.lang.String url) {
    isPreload = true;
    statistics.srcUrl = url.trim();
    this.srcUrl = com.tencent.sonic.sdk.SonicUtils.addSonicUrlParam(statistics.srcUrl, com.tencent.sonic.sdk.SonicSession.SONIC_URL_PARAM_SESSION_ID, java.lang.String.valueOf(sId));
    this.currUrl = srcUrl;
    if (com.tencent.sonic.sdk.SonicUtils.shouldLog(Log.INFO)) {
        com.tencent.sonic.sdk.SonicUtils.log(com.tencent.sonic.sdk.SonicSession.TAG, Log.INFO, (((("session(" + (sId)) + ") is preload, new url=") + url) + "."));
    }
}
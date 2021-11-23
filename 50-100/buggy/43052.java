protected boolean onClientPageFinished(java.lang.String url) {
    if (isMatchCurrentUrl(url)) {
        com.tencent.sonic.sdk.SonicUtils.log(com.tencent.sonic.sdk.SonicSession.TAG, Log.INFO, (((("session(" + (sId)) + ") onClientPageFinished:url=") + url) + "."));
        wasOnPageFinishInvoked.set(true);
        return true;
    }
    return false;
}
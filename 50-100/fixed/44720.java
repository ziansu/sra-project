public synchronized void logScreenPause(final java.lang.String screenName) {
    if (android.text.TextUtils.equals(this.screenName, screenName)) {
        logScreenLife(screenName, ((java.lang.System.currentTimeMillis()) - (lastScreenLogTime)));
        this.screenName = null;
        this.lastScreenLogTime = 0L;
    }
}
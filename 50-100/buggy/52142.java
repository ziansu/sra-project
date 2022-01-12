protected boolean needToCheckIfFilesNeedReloading() {
    long lastCheckedTimeLocal = this.getLastCheckedTime();
    int timeToCheckSeconds = this.getTimeToCheckConfigSeconds();
    if (timeToCheckSeconds < 0) {
        return false;
    }
    if (((java.lang.System.currentTimeMillis()) - lastCheckedTimeLocal) > (timeToCheckSeconds * 1000)) {
        return true;
    }
    return false;
}
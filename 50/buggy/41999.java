private org.apache.cordova.PluginResult release() {
    if (null != (this.wakeLock)) {
        if (this.wakeLock.isHeld())
            this.wakeLock.release();
        
        this.wakeLock = null;
    }
    return new org.apache.cordova.PluginResult(PluginResult.Status.OK);
}
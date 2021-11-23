public void notifyCriticalError(java.lang.String message) {
    com.freedomotic.api.Plugin.LOG.warning(message);
    setDescription(message);
    com.freedomotic.events.MessageEvent callout = new com.freedomotic.events.MessageEvent(this, message);
    callout.setType("callout");
    callout.setLevel("warning");
    callout.setExpiration((10 * 1000));
    busService.send(callout);
    stop();
    currentPluginStatus = PluginStatus.FAILED;
}
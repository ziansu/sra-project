public void setTransportId(java.lang.String transportId) {
    this.transportId = transportId;
    disablePrevPingWatchdog();
    if (pingWachdog) {
        org.kurento.jsonrpc.internal.server.PingWatchdogManager.log.info(("Setting new transportId={} for sessionId={}. " + ("Restarting timer to consider disconnected client if pings are not received in {}" + " millis")), transportId, sessionId, ((org.kurento.jsonrpc.internal.server.PingWatchdogManager.NUM_NO_PINGS_TO_CLOSE) * (pingInterval)));
        activateSessionCloser();
    }
}
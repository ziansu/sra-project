public void handleUnparseableMessage(asia.stampy.common.gateway.HostPort hostPort, java.lang.String msg, asia.stampy.common.parsing.UnparseableException e) {
    asia.stampy.common.gateway.StampyHandlerHelper.log.debug("Unparseable message, delegating to unparseable message handler");
    try {
        getUnparseableMessageHandler().unparseableMessage(msg, hostPort);
    } catch (java.lang.Exception e1) {
        try {
            errorHandle(e1, hostPort);
        } catch (java.lang.Exception e2) {
            asia.stampy.common.gateway.StampyHandlerHelper.log.error("Could not parse message {} for {}", msg, hostPort, e);
            asia.stampy.common.gateway.StampyHandlerHelper.log.error("Unexpected exception sending error message for {}", hostPort, e2);
        }
    }
}
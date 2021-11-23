public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    if ((reconnectFuture) != null) {
        reconnectFuture.cancel(false);
    }
    stop();
}
public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    master = getMaster();
    if (null != (master)) {
        checkConnection();
        node.removeChild("start");
        makeStopAction();
    }
}
public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    localDevice.terminate();
    init();
}
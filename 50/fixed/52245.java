public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    relinquish(priority);
    refreshPriorities();
}
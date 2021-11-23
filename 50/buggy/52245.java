public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    relinquish(priority);
    try {
        java.lang.Thread.sleep(300);
    } catch (java.lang.InterruptedException e) {
    }
    refreshPriorities();
}
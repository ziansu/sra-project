private java.lang.String getRunningWorklets() {
    java.util.Collection<org.yawlfoundation.yawl.worklet.selection.WorkletRunner> runners = _ws.getAllRunners().values();
    if (runners.isEmpty()) {
        return fail("No worklet instances currently running");
    }
    org.yawlfoundation.yawl.util.XNode root = new org.yawlfoundation.yawl.util.XNode("runningworklets");
    for (org.yawlfoundation.yawl.worklet.selection.WorkletRunner runner : runners) {
        root.addChild(runner.toXNode());
    }
    return root.toString();
}
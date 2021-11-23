public static void log(java.lang.String event, org.yawlfoundation.yawl.engine.interfce.WorkItemRecord wir, int xType) {
    org.yawlfoundation.yawl.worklet.support.EventLogger.log(event, wir.getCaseID(), new org.yawlfoundation.yawl.engine.YSpecificationID(wir), wir.getTaskID(), "", xType);
}
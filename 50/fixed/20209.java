public static boolean log(java.lang.String event, org.yawlfoundation.yawl.engine.interfce.WorkItemRecord wir, int xType) {
    return org.yawlfoundation.yawl.worklet.support.EventLogger.log(event, wir.getCaseID(), new org.yawlfoundation.yawl.engine.YSpecificationID(wir), wir.getTaskID(), "", xType);
}
@java.lang.Override
public void performancesChanged(java.lang.String connId, int exchangesCompleted) {
    long duration = (java.lang.System.currentTimeMillis()) - (startTime);
    final org.talend.core.model.process.IConnection conn = traceConnectionsManager.finConnectionByUniqueName(connId);
    final org.talend.core.model.runprocess.data.PerformanceData perfData = new org.talend.core.model.runprocess.data.PerformanceData(((((connId + "|") + exchangesCompleted) + "|") + duration));
    processPerformances(((((connId + "|") + exchangesCompleted) + "|") + duration), perfData, conn);
    startTime = java.lang.System.currentTimeMillis();
}
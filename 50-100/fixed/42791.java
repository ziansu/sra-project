private com.heimuheimu.naiverpc.monitor.reporter.FalconData getServerAverageExecutionTime() {
    com.heimuheimu.naiverpc.monitor.ExecutionTimeInfo executionTimeInfo = com.heimuheimu.naiverpc.monitor.rpc.server.RpcExecuteMonitor.get().getExecutionTimeInfo();
    long executionCount = executionTimeInfo.getCount();
    long totalExecutionTime = executionTimeInfo.getTotalExecutionTime();
    com.heimuheimu.naiverpc.monitor.reporter.FalconData avgExecTimeData = create();
    avgExecTimeData.metric = "naiverpc_server_avg_exec_time";
    if (executionCount > (lastExecutionCount)) {
        avgExecTimeData.value = (totalExecutionTime - (lastTotalExecutionTime)) / (executionCount - (lastExecutionCount));
    }else {
        avgExecTimeData.value = 0;
    }
    lastExecutionCount = executionCount;
    lastTotalExecutionTime = totalExecutionTime;
    return avgExecTimeData;
}
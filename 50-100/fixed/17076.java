protected void getParallelismChangesForConstraint(eu.stratosphere.nephele.streaming.JobGraphLatencyConstraint constraint, eu.stratosphere.nephele.streaming.taskmanager.qosmanager.QosConstraintSummary constraintSummary, java.util.Map<eu.stratosphere.nephele.jobgraph.JobVertexID, java.lang.Integer> parallelismChanges) throws eu.stratosphere.nephele.streaming.jobmanager.autoscaling.UnexpectedVertexExecutionStateException {
    java.util.ArrayList<eu.stratosphere.nephele.streaming.jobmanager.autoscaling.optimization.GG1Server> servers = createServers(constraint, constraintSummary, parallelismChanges);
    if (hasBottleneck(servers)) {
        resolveBottleneck(parallelismChanges, servers);
    }else {
        rebalance(constraint, constraintSummary, parallelismChanges, servers);
    }
}
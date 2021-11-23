public org.apache.flink.streaming.statistics.taskmanager.qosmodel.QosGroupVertex getOrCreateGroupVertex(org.apache.flink.runtime.executiongraph.ExecutionJobVertex execVertex) {
    org.apache.flink.streaming.statistics.taskmanager.qosmodel.QosGroupVertex groupVertex = this.vertexByID.get(execVertex.getJobVertexId());
    if (groupVertex == null) {
        groupVertex = new org.apache.flink.streaming.statistics.taskmanager.qosmodel.QosGroupVertex(execVertex.getJobVertexId(), execVertex.getJobVertex().getName());
        this.vertexByID.put(execVertex.getJobVertexId(), groupVertex);
    }
    return groupVertex;
}
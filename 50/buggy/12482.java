public void setStatus(java.lang.String topologyId, java.lang.String status) {
    backtype.storm.scheduler.Cluster.LOG.info("set topo {} status {}", topologyId, status);
    this.status.put(topologyId, status);
}
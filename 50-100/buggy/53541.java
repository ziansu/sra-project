@java.lang.Override
public void handleUnreachableNode(final java.lang.String nodeName) {
    com.orientechnologies.orient.server.distributed.impl.ODistributedServerLog.debug(this, manager.getLocalNodeName(), nodeName, DIRECTION.IN, "Distributed transaction: rolling back all the pending transactions coordinated by the unreachable server '%s'", nodeName);
    final com.orientechnologies.orient.server.distributed.impl.task.OUnreachableServerLocalTask task = new com.orientechnologies.orient.server.distributed.impl.task.OUnreachableServerLocalTask(nodeName);
    final com.orientechnologies.orient.server.distributed.impl.ODistributedRequest rollbackRequest = new com.orientechnologies.orient.server.distributed.impl.ODistributedRequest(null, manager.getLocalNodeId(), manager.getNextMessageIdCounter(), null, task);
    processRequest(rollbackRequest, false);
}
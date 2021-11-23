protected com.orientechnologies.orient.server.hazelcast.ODistributedWorker unqueuePendingMessages(boolean iRestoreMessages, boolean iUnqueuePendingMessages, java.lang.String queueName, com.hazelcast.core.IQueue requestQueue) {
    if (com.orientechnologies.orient.server.distributed.ODistributedServerLog.isDebugEnabled())
        com.orientechnologies.orient.server.distributed.ODistributedServerLog.debug(this, getLocalNodeName(), null, DIRECTION.NONE, "listening for incoming requests on queue: %s", queueName);
    
    restoreMessagesBeforeFailure(iRestoreMessages);
    restoringMessages = msgService.checkForPendingMessages(requestQueue, queueName, iUnqueuePendingMessages);
    final com.orientechnologies.orient.server.hazelcast.ODistributedWorker listenerThread = new com.orientechnologies.orient.server.hazelcast.ODistributedWorker(this, requestQueue, databaseName, 0, restoringMessages);
    listenerThread.initDatabaseInstance();
    listenerThread.start();
    return listenerThread;
}
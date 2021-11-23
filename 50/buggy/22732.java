public java.lang.String[] getQueueProducers(java.lang.String name) {
    return com.mapr.distiller.server.queues.RecordQueueManager.nameToRecordQueueMap.get(name).listProducers();
}
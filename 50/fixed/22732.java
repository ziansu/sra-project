public java.lang.String[] getQueueProducers(java.lang.String name) {
    if ((com.mapr.distiller.server.queues.RecordQueueManager.nameToRecordQueueMap.get(name)) == null)
        return new java.lang.String[0];
    
    return com.mapr.distiller.server.queues.RecordQueueManager.nameToRecordQueueMap.get(name).listProducers();
}
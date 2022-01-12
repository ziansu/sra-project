public int getQueueCapacity(java.lang.String name) {
    if ((com.mapr.distiller.server.queues.RecordQueueManager.nameToRecordQueueMap.get(name)) == null)
        return -1;
    
    return com.mapr.distiller.server.queues.RecordQueueManager.nameToRecordQueueMap.get(name).maxQueueSize();
}
public int getQueueCapacity(java.lang.String name) {
    return com.mapr.distiller.server.queues.RecordQueueManager.nameToRecordQueueMap.get(name).maxQueueSize();
}
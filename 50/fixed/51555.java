public org.apache.hadoop.yarn.server.resourcemanager.resource.ResourceWeights getQueueWeight(java.lang.String queue) {
    synchronized(queueWeights) {
        org.apache.hadoop.yarn.server.resourcemanager.resource.ResourceWeights weight = queueWeights.get(queue);
        return weight == null ? org.apache.hadoop.yarn.server.resourcemanager.resource.ResourceWeights.NEUTRAL : weight;
    }
}
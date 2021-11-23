@java.lang.SuppressWarnings(value = "unchecked")
public <T> org.apache.flink.streaming.partitioner.StreamPartitioner<T> getPartitioner(java.lang.ClassLoader cl, java.lang.String output) {
    org.apache.flink.streaming.partitioner.StreamPartitioner<T> partitioner = null;
    try {
        partitioner = ((org.apache.flink.streaming.partitioner.StreamPartitioner<T>) (org.apache.flink.util.InstantiationUtil.readObjectFromConfig(this.config, ((org.apache.flink.streaming.api.StreamConfig.PARTITIONER_OBJECT) + output), cl)));
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Partitioner could not be instantiated.");
    }
    if (partitioner != null) {
        return partitioner;
    }else {
        return new org.apache.flink.streaming.partitioner.ShufflePartitioner<T>();
    }
}
private boolean isFullyBalanced(java.util.Map<java.lang.String, java.util.List<org.apache.kafka.common.TopicPartition>> assignment) {
    int min = java.lang.Integer.MAX_VALUE;
    int max = java.lang.Integer.MIN_VALUE;
    for (java.util.List<org.apache.kafka.common.TopicPartition> topicPartitions : assignment.values()) {
        int size = topicPartitions.size();
        if (size < min)
            min = size;
        
        if (size > max)
            max = size;
        
    }
    return (max - min) <= 1;
}
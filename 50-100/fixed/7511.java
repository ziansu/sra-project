protected java.util.Map<java.lang.String, java.util.List<org.apache.kafka.common.TopicPartition>> deepCopy(java.util.Map<java.lang.String, java.util.List<org.apache.kafka.common.TopicPartition>> assignment) {
    java.util.Map<java.lang.String, java.util.List<org.apache.kafka.common.TopicPartition>> copy = new java.util.HashMap<>();
    deepCopy(assignment, copy);
    return copy;
}
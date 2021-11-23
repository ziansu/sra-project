public java.util.List<com.ctrip.hermes.metaservice.model.ConsumerGroup> findByTopic(final java.lang.Long topicId) throws org.unidal.dal.jdbc.DalException {
    try {
        return topicCache.get(topicId);
    } catch (java.util.concurrent.ExecutionException e) {
        throw new org.unidal.dal.jdbc.DalException(null, e.getCause());
    }
}
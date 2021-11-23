public java.util.List<com.ctrip.hermes.meta.entity.ConsumerGroup> getConsumers(java.lang.String topic) {
    return m_metaService.getMeta().getTopics().get(topic).getConsumerGroups();
}
public java.util.Map<java.lang.String, java.util.List<com.ctrip.hermes.meta.entity.ConsumerGroup>> getConsumers() {
    java.util.Map<java.lang.String, java.util.List<com.ctrip.hermes.meta.entity.ConsumerGroup>> map = new java.util.LinkedHashMap<java.lang.String, java.util.List<com.ctrip.hermes.meta.entity.ConsumerGroup>>();
    for (java.util.Map.Entry<java.lang.String, com.ctrip.hermes.meta.entity.Topic> entry : m_metaService.getMeta().getTopics().entrySet()) {
        map.put(entry.getKey(), new java.util.ArrayList(entry.getValue().getConsumerGroups().values()));
    }
    return map;
}
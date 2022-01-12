public void addTopicFromDatable(cucumber.api.DataTable dataTable) {
    final java.util.List<fixtures.common.kafka.TopicInfo> topicInfos = dataTable.asList(fixtures.common.kafka.TopicInfo.class);
    for (fixtures.common.kafka.TopicInfo topicInfo : topicInfos) {
        final java.lang.Integer nombreDePartitions = (((topicInfo.nombreDePartitions) != null) && ((topicInfo.nombreDePartitions) > 1)) ? topicInfo.nombreDePartitions : 1;
        addTopic(topicInfo.nom, com.google.common.base.Optional.of(nombreDePartitions));
    }
}
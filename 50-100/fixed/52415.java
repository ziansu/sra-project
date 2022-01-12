public static com.czbix.v2ex.model.TopicWithComments parseDoc(org.jsoup.nodes.Document doc, com.czbix.v2ex.model.Topic topic) {
    final com.czbix.v2ex.model.Topic.Builder topicBuilder = topic.toBuilder();
    com.czbix.v2ex.parser.TopicParser.parseContent(topicBuilder, doc.select(".topic_content"));
    return new com.czbix.v2ex.model.TopicWithComments(topicBuilder.createTopic(), com.google.common.collect.Lists.<java.lang.String>newArrayList());
}
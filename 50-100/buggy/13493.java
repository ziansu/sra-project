@org.junit.Before
public void setup() {
    org.mockito.Mockito.when(application.getConfiguration()).thenReturn(com.metabroadcast.applications.client.model.internal.ApplicationConfiguration.builder().withNoPrecedence(getPublishers()).withEnabledWriteSources(com.google.common.collect.ImmutableList.of()).build());
    executor = new org.atlasapi.query.v4.topic.TopicContentQueryExecutor(topicResolver, contentIndex, equivalentsResolver);
    queryContext = org.atlasapi.query.common.context.QueryContext.create(application, org.atlasapi.query.annotation.ActiveAnnotations.standard(), request);
}
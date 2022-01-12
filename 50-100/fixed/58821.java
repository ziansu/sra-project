@org.testng.annotations.Test
public void createTopicShouldDeleteDraft() throws org.jtalks.jcommune.plugin.api.exceptions.NotFoundException {
    user.setAutosubscribe(false);
    createTopicStubs();
    java.lang.String bodyText = "topic content";
    org.jtalks.jcommune.service.transactional.Topic topic = createTopic();
    topicService.createTopic(topic, bodyText);
    verify(topicDraftService).deleteDraft();
}
@org.testng.annotations.Test
public void createTopicShouldDeleteDraft() throws org.jtalks.jcommune.plugin.api.exceptions.NotFoundException {
    org.jtalks.jcommune.service.transactional.Branch branch = createBranch();
    user.setAutosubscribe(false);
    createTopicStubs(branch);
    java.lang.String bodyText = "topic content";
    org.jtalks.jcommune.service.transactional.Topic topic = createTopic();
    topicService.createTopic(topic, bodyText);
    verify(topicDraftService).deleteDraft();
}
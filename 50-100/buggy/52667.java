@org.testng.annotations.Test
public void createTopicShouldNotifyMentionedUsers() throws org.jtalks.jcommune.plugin.api.exceptions.NotFoundException {
    org.jtalks.jcommune.service.transactional.Branch branch = createBranch();
    user.setAutosubscribe(false);
    createTopicStubs(branch);
    java.lang.String answerBodyWithUserMentioning = "[user]Shogun[/user] you are mentioned";
    org.jtalks.jcommune.service.transactional.Topic topicWithUserNotification = createTopic();
    org.jtalks.jcommune.service.transactional.Topic createdTopic = topicService.createTopic(topicWithUserNotification, answerBodyWithUserMentioning);
    verify(userService).notifyAndMarkNewlyMentionedUsers(createdTopic.getFirstPost());
}
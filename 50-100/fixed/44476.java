@org.testng.annotations.Test
public void updateLastPostInBranchByCreateTopic() throws org.jtalks.jcommune.plugin.api.exceptions.NotFoundException {
    org.jtalks.jcommune.service.transactional.Branch branch = createBranch();
    createTopicStubs();
    org.jtalks.jcommune.service.transactional.Topic tmp = createTopic();
    tmp.setBranch(branch);
    org.jtalks.jcommune.service.transactional.Topic topic = topicService.createTopic(tmp, "content");
    assertEquals(branch.getLastPost(), topic.getFirstPost());
}
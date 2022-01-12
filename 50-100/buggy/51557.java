@org.springframework.security.access.prepost.PreAuthorize(value = "(hasPermission(#post.topic.branch.id, 'BRANCH', 'BranchPermission.DELETE_OWN_POSTS') and " + "#post.userCreated.username == principal.username)")
@java.lang.Override
public void deleteDraft(org.jtalks.jcommune.service.transactional.Post post) {
    if (!(PostState.DRAFT.equals(post.getState()))) {
        new java.lang.IllegalArgumentException(("Required DRAFT but got " + (java.lang.String.valueOf(post.getState()))));
    }
    org.jtalks.jcommune.service.transactional.Topic topic = post.getTopic();
    topic.removePost(post);
    topicDao.saveOrUpdate(topic);
    securityService.deleteFromAcl(post);
    logger.debug("Deleted draft id={}", post.getId());
}
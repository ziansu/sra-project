@java.lang.Override
public com.cooksys.fastbook.models.Post addPostToGroup(java.lang.Integer groupId, com.cooksys.fastbook.models.Post post) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    groupWall = groupController.getGroup(groupId);
    java.util.Set<com.cooksys.fastbook.models.Group> groups = post.getGroups();
    groups.add(groupWall);
    post.setGroups(groups);
    session.save(post);
    return post;
}
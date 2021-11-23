private static void updateUserStatus(content.Forum forum, users.User user) {
    java.lang.String newStatus = forum.getStatusTypes().get(forum.getNumberOfMessagesForUser(user));
    if (newStatus != null) {
        user.setStatus(newStatus);
        utils.HibernateUtils.save(user);
    }
}
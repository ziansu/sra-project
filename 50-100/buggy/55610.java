public static boolean editMessage(content.Forum forum, content.SubForum subForum, users.User user, content.Message msg, java.lang.String content) throws controllers.UserNotAuthorizedException {
    if (policy.PolicyHandler.canUserEditComment(forum, subForum, user, msg)) {
        if (controllers.ContentController.editPost(msg, content)) {
            return utils.HibernateUtils.save(msg);
        }
    }
    utils.ForumLogger.errorLog((("The user " + (user.getUsername())) + " can't edit post"));
    throw new controllers.UserNotAuthorizedException("to edit post.");
}
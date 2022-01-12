public static boolean changeForumPolicy(users.User superAdmin, content.Forum forum, policy.ForumPolicy policy) throws controllers.UserNotAuthorizedException {
    if (policy.PolicyHandler.canUserChangePolicy(superAdmin, forum)) {
        if (forum.setPolicy(policy)) {
            return utils.HibernateUtils.update(forum);
        }
        return false;
    }
    utils.ForumLogger.errorLog((("The user " + (superAdmin.getUsername())) + " can't change forum policy"));
    throw new controllers.UserNotAuthorizedException("to change forum policy.");
}
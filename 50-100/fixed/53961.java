public static boolean deactivate(users.User user) throws controllers.UserNotAuthorizedException {
    if (policy.PolicyHandler.canUserBeDeactivated(user)) {
        if (user.deactivate()) {
            return utils.HibernateUtils.update(user);
        }
    }
    utils.ForumLogger.errorLog((("The user " + (user.getUsername())) + " has no permissions to deactivate itself"));
    throw new controllers.UserNotAuthorizedException("to deactivate itself.");
}
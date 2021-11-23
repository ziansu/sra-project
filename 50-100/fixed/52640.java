public static boolean banUser(content.SubForum subForum, users.User moderator, users.User member) throws exceptions.UserNotAuthorizedException {
    if (policy.PolicyHandler.canUserBanMember(subForum, moderator, member)) {
        boolean b = member.banUser();
        if (b) {
            return utils.HibernateUtils.update(member);
        }
        return false;
    }
    utils.ForumLogger.errorLog((("The user " + (moderator.getUsername())) + " can't ban user"));
    throw new exceptions.UserNotAuthorizedException("to ban user");
}
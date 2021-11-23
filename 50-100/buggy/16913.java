public org.sakaiproject.entitybroker.providers.model.EntityUser getUserById(java.lang.String userId) {
    userId = findAndCheckUserId(userId, null);
    if (userId == null) {
        return null;
    }
    org.sakaiproject.user.api.User user = getUserByIdEid(((org.sakaiproject.entitybroker.providers.UserEntityProvider.ID_PREFIX) + userId));
    org.sakaiproject.entitybroker.providers.model.EntityUser eu = convertUser(user);
    return eu;
}
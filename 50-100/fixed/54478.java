public static java.lang.String getFullNameById(com.quickblox.q_municate_db.managers.DataManager dataManager, int userId) {
    com.quickblox.q_municate_user_service.model.QMUser user = null;
    try {
        user = com.quickblox.q_municate_user_service.QMUserService.getInstance().getUserSync(userId, false);
    } catch (com.quickblox.core.exception.QBResponseException e) {
        user = null;
    }
    return user != null ? user.getFullName() : "";
}
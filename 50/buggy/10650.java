@play.db.jpa.Transactional(readOnly = true)
public java.util.ArrayList<models.UserLabRole> getRoleAccess(java.lang.String email) {
    models.User user = new models.User();
    core.UserCore userCore = new core.UserCore();
    java.util.ArrayList<models.UserLabRole> userLabRole = userCore.getUserLabRole(jpaApi, email);
    return userLabRole;
}
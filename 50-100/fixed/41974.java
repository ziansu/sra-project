public static java.lang.String findUser() {
    java.lang.String results = null;
    final org.hadatac.console.models.SysUser user = org.hadatac.console.controllers.AuthApplication.getLocalUser(session());
    if (null == user) {
        results = null;
    }else {
        results = org.hadatac.console.controllers.triplestore.UserManagement.getUriByEmail(user.getEmail());
    }
    return results;
}
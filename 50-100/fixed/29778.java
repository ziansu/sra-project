public static hvz.server.User loginUser(hvz.server.User user, java.lang.String password) {
    try {
        java.lang.String dbpass = hvz.server.DBHandler.getPassword(user.feedcode, hvz.server.Server.c);
        java.lang.String apppass = password;
        if ((dbpass.equals(apppass)) == true) {
            return user;
        }else {
            return null;
        }
    } catch (java.sql.SQLException e) {
    }
    return null;
}
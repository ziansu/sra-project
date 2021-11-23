public static ch.zbw.sysVentorySaas.App.model.User validate(java.lang.String username, java.lang.String password) {
    for (ch.zbw.sysVentorySaas.App.model.User oneUser : ch.zbw.sysVentorySaas.App.DataAccessObject.UserDAO.getAllUsers()) {
        if (oneUser != null) {
            if ((oneUser.getUsername().equals(username)) && (password.equals(oneUser.getPassword()))) {
                return oneUser;
            }
        }
    }
    return null;
}
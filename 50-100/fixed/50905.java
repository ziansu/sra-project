public static ntut.csie.ezScrum.web.dataObject.AccountObject confirmAccount(java.lang.String username, java.lang.String password) {
    if ((password.length()) != 32) {
        password = ntut.csie.ezScrum.dao.AccountDAO.getInstance().getMd5(password);
    }
    return ntut.csie.ezScrum.dao.AccountDAO.getInstance().confirmAccount(username, password);
}
@java.lang.Override
public com.icegreen.greenmail.user.GreenMailUser setUser(java.lang.String email, java.lang.String login, java.lang.String password) {
    com.icegreen.greenmail.user.GreenMailUser user = managers.getUserManager().getUser(login);
    if (null == user) {
        try {
            user = managers.getUserManager().createUser(email, login, password);
        } catch (com.icegreen.greenmail.user.UserException e) {
            throw new java.lang.RuntimeException(e);
        }
    }else {
        user.setPassword(password);
    }
    return user;
}
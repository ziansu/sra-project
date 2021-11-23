@java.lang.Override
public java.lang.String login(model.UserDetails details) {
    curUserSession = details;
    return cloudDatabase.login(curUserSession);
}
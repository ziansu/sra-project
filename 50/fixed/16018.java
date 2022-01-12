@java.lang.Override
public java.lang.String login(model.UserDetails details) {
    return cloudDatabase.login(details);
}
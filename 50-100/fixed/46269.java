@java.lang.Override
public org.apache.wicket.authroles.authorization.strategies.role.Roles getRoles() {
    if (!(isSignedIn())) {
        return null;
    }
    final java.util.List<java.lang.String> roles = authenticationSession.getRoles();
    return new org.apache.wicket.authroles.authorization.strategies.role.Roles(roles.toArray(new java.lang.String[roles.size()]));
}
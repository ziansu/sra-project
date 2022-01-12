@java.lang.Override
public fr.emse.ewall.model.User checkUser(java.lang.String login, java.lang.String password) {
    org.springframework.ldap.query.LdapQuery query = org.springframework.ldap.query.LdapQueryBuilder.query().where("objectClass").is("person").and("uid").is(login);
    try {
        ldapTemplate.authenticate(query, password);
        return userService.findOrCreateUser(login, Role.PUBLIC, Role.WRITER);
    } catch (java.lang.RuntimeException e) {
        fr.emse.ewall.security.ldap.LdapServerService.logger.error("Error on login", e);
        throw new fr.emse.ewall.exception.BadCredentialsException();
    }
}
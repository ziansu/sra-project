@java.lang.Override
public org.carewebframework.api.domain.IUser authenticate(java.lang.String username, java.lang.String password) {
    org.carewebframework.vista.mbroker.BrokerSession broker = org.carewebframework.vista.api.util.VistAUtil.getBrokerSession();
    org.carewebframework.vista.mbroker.Security.AuthResult authResult = broker.authenticate(username, password, getLogicalId());
    org.carewebframework.api.domain.User user = getAuthenticatedUser(broker);
    user.setLoginName(username);
    user.setPassword(password);
    user.setSecurityDomain(this);
    checkAuthResult(authResult, user);
    return user;
}
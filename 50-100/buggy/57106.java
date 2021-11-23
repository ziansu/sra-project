private boolean validateCookie(java.lang.String cookie, java.lang.String ip) throws java.lang.Exception {
    java.lang.String username = m_config.getAccount().getKey();
    java.lang.String pwd = m_config.getAccount().getValue();
    java.lang.String cookieDecoded = com.ctrip.hermes.portal.resource.assists.ValidationUtils.decode(cookie);
    return ((username + pwd) + ip).equals(cookieDecoded);
}
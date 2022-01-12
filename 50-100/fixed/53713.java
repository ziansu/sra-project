@java.lang.Override
public boolean canHandle(javax.servlet.http.HttpServletRequest request) {
    if (com.wso2telco.gsma.authenticators.MSISDNAuthenticator.log.isDebugEnabled()) {
        com.wso2telco.gsma.authenticators.MSISDNAuthenticator.log.debug("MSISDN Authenticator canHandle invoked");
    }
    if (((request.getParameter("msisdn")) != null) || ((getLoginHintValues(request)) != null)) {
        com.wso2telco.gsma.authenticators.MSISDNAuthenticator.log.info("msisdn forwarding ");
        return true;
    }
    return false;
}
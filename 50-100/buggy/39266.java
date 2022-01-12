@javax.annotation.PostConstruct
public void init() {
    org.jasig.cas.client.authentication.AttributePrincipal principal = ((org.jasig.cas.client.authentication.AttributePrincipal) (com.hsuforum.common.web.jsf.utils.JSFUtils.getHttpServletRequest().getUserPrincipal()));
    java.util.Map attributes = principal.getAttributes();
    java.lang.String userId = ((java.lang.String) (attributes.get("sAMAccountName")));
    logger.info(("login portal user id =" + userId));
    this.setUserId(userId);
}
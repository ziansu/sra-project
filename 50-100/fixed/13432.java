@java.lang.Override
protected boolean onLoginSuccess(org.apache.shiro.authc.AuthenticationToken token, org.apache.shiro.subject.Subject subject, javax.servlet.ServletRequest request, javax.servlet.ServletResponse response) throws java.lang.Exception {
    java.lang.String username = ((java.lang.String) (token.getPrincipal()));
    com.huntering.beans.account.entity.Account user = accountService.findByEmail(username);
    ((javax.servlet.http.HttpServletRequest) (request)).getSession().setAttribute(Constants.CURRENT_USER, user);
    return super.onLoginSuccess(token, subject, request, response);
}
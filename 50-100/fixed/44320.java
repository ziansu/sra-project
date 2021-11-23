@java.lang.Override
public void wrapClientCredentialLogin(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res, java.util.Map<java.lang.String, java.lang.String> loginInfo, java.lang.String clientId) throws java.io.IOException, javax.servlet.ServletException {
    if ((!(org.flywaydb.core.internal.util.StringUtils.hasText(req.getHeader("Authorization")))) && (isUrlEncodedForm(req))) {
        doClientCredentialLogin(req, loginInfo, clientId);
    }
}
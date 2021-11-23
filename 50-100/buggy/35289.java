protected boolean login(javax.servlet.http.HttpServletResponse response, java.lang.String email, java.lang.Integer uid) {
    if (((response == null) || (org.apache.commons.lang.StringUtils.isBlank(email))) || (uid == null)) {
        return false;
    }
    try {
        com.uyoung.core.api.constant.LoginUtil.addLoginCookie(response, email, uid);
        com.uyoung.core.api.model.Login login = com.uyoung.core.api.constant.LoginUtil.updateLogin(email, uid);
        loginService.addOrUpdate(login);
        return true;
    } catch (java.lang.Exception e) {
        com.uyoung.web.controller.base.LoginBaseController.LOGGER.error("#Login error.Cause:", e);
    }
    return false;
}
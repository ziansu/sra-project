@java.lang.Override
public java.lang.String preLogin(javax.servlet.http.HttpServletRequest request) {
    org.shaolin.vogerp.commonmodel.ICaptcherService service = IServerServiceManager.INSTANCE.getService(org.shaolin.vogerp.commonmodel.ICaptcherService.class);
    org.shaolin.vogerp.commonmodel.be.ICaptcha captcha = service.getItem(service.generateOne());
    javax.servlet.http.HttpSession session = request.getSession();
    session.setAttribute(WebflowConstants.USER_TOKEN, captcha.getAnswer());
    return captcha.getQuestion();
}
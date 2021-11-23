private static java.lang.String generateToken(javax.servlet.http.HttpServletRequest request) {
    javax.servlet.http.HttpSession session = request.getSession();
    java.lang.String token = com.agapsys.captcha.CaptchaServlet.CAGE.getTokenGenerator().next();
    session.setAttribute(com.agapsys.captcha.CaptchaServlet.ATR_SESSION_TOKEN, token);
    return token;
}
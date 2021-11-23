@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler, org.springframework.web.servlet.ModelAndView view) {
    org.springframework.security.web.csrf.CsrfToken token = ((org.springframework.security.web.csrf.CsrfToken) (request.getAttribute(org.springframework.security.web.csrf.CsrfToken.class.getName())));
    if (token != null) {
        view.addObject(token.getParameterName(), token);
    }
}
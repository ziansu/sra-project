@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws java.lang.Exception {
    java.security.Principal principal = request.getUserPrincipal();
    if (principal != null) {
        modelAndView.addObject("username", principal.getName());
    }
}
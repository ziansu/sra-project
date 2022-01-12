@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws java.lang.Exception {
    java.lang.String context = request.getContextPath();
    if ((context != null) && (!(context.equals("")))) {
        modelAndView.addObject("contextPath", context);
    }
}
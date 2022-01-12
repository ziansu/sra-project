@java.lang.Override
public java.lang.String getUserId() {
    org.springframework.web.context.request.RequestAttributes requestAttributes = org.springframework.web.context.request.RequestContextHolder.currentRequestAttributes();
    javax.servlet.http.HttpServletRequest request = ((org.springframework.web.context.request.ServletRequestAttributes) (requestAttributes)).getRequest();
    java.lang.String userId = request.getParameter("username");
    if (org.springframework.util.StringUtils.isEmpty(userId)) {
        userId = ((java.lang.String) (request.getSession().getAttribute("username")));
    }else {
        request.getSession().setAttribute("username", userId);
    }
    return userId.toLowerCase();
}
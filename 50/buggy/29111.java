public static <T> T getRequiredBean(javax.servlet.http.HttpServletRequest request, java.lang.Class<T> requiredType) {
    javax.servlet.http.HttpSession session = request.getSession();
    return com.feilong.spring.web.util.WebSpringUtil.getBean(session, requiredType);
}
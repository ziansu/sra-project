public static org.springframework.security.core.userdetails.UserDetails getCurrentUser() {
    try {
        return java.util.Optional.of(((org.springframework.security.core.userdetails.UserDetails) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal()))).get();
    } catch (java.lang.NullPointerException ex) {
        throw new org.aming.web.qq.exceptions.WebQQException(5001, "没有发现当前用户", ex);
    } catch (java.lang.Exception ex) {
        throw new org.aming.web.qq.exceptions.WebQQException();
    }
}
public java.lang.Object getPrincipal() {
    return getIsAnonymous() ? null : org.apache.shiro.SecurityUtils.getSubject().getPrincipal();
}
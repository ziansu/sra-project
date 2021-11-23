@java.lang.Override
public com.onestorecorp.onetests.domain.User getCurrentAuditor() {
    org.springframework.security.core.Authentication authentication = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    if ((authentication == null) || (!(authentication.isAuthenticated()))) {
        return null;
    }
    return ((com.onestorecorp.onetests.domain.User) (authentication.getPrincipal()));
}
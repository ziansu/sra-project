public static java.lang.Boolean checkForAuthority(org.roysez.app.enums.Role roleToCheck) {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    if (auth == null) {
        return false;
    }
    java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> authorities = auth.getAuthorities();
    for (org.springframework.security.core.GrantedAuthority grantedAuthority : authorities) {
        if (grantedAuthority.getAuthority().equals(("ROLE_" + roleToCheck))) {
            return true;
        }
    }
    return false;
}
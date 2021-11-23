protected java.lang.String determineTargetUrl(org.springframework.security.core.Authentication authentication) {
    java.lang.String url = "";
    java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> authorities = authentication.getAuthorities();
    java.util.List<java.lang.String> roles = new java.util.ArrayList<java.lang.String>();
    for (org.springframework.security.core.GrantedAuthority a : authorities) {
        roles.add(a.getAuthority());
    }
    if (roles.contains("ROLE_ADMIN")) {
        url = "/";
    }else {
        url = "/";
    }
    return url;
}
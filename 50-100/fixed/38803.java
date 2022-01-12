public com.portlandwebworks.chhs.authentication.AuthenticationDetails authenticated() {
    final org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    if (((auth != null) && (auth.isAuthenticated())) && ((auth.getPrincipal()) instanceof com.portlandwebworks.chhs.authentication.AuthenticationDetails)) {
        return ((com.portlandwebworks.chhs.authentication.AuthenticationDetails) (auth.getPrincipal()));
    }else {
        return null;
    }
}
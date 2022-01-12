public static boolean isAdmin() {
    java.lang.Object principal = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    if (principal.toString().equals("anonymousUser")) {
        return false;
    }
    org.springframework.security.core.userdetails.User user = ((org.springframework.security.core.userdetails.User) (principal));
    return user.getAuthorities().contains(new org.springframework.security.core.authority.SimpleGrantedAuthority("ROLE_ADMIN"));
}
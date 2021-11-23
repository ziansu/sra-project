public static java.lang.String getAuthenticatedUserName() {
    java.lang.String userName = null;
    java.lang.Object principal = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    if (principal instanceof org.springframework.security.core.userdetails.UserDetails) {
        userName = ((org.springframework.security.core.userdetails.UserDetails) (principal)).getUsername();
    }else {
        userName = principal.toString();
    }
    return userName;
}
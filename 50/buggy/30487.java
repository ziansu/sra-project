public static java.lang.String getLoginNameFromAuthentication(org.springframework.security.core.Authentication auth) {
    com.colorado.denver.model.User user = ((com.colorado.denver.model.User) (auth.getPrincipal()));
    return user.getUsername();
}
public static java.lang.String getLoginNameFromAuthentication(org.springframework.security.core.Authentication auth) {
    return auth.getPrincipal().toString();
}
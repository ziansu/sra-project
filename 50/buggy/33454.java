@java.lang.Override
public boolean supports(java.lang.Class<?> authentication) {
    return authentication.equals(org.springframework.security.authentication.UsernamePasswordAuthenticationToken.class);
}
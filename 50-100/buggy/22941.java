@java.lang.Override
public void autologin(java.lang.String username, java.lang.String password) {
    org.springframework.security.core.userdetails.UserDetails userDetails = userDetailsService.loadUserByUsername(username);
    org.springframework.security.authentication.UsernamePasswordAuthenticationToken authenticationToken = new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
    authenticationManager.authenticate(authenticationToken);
    if (authenticationToken.isAuthenticated()) {
        org.springframework.security.core.context.SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    }
}
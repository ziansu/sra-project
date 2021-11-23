@java.lang.Override
public java.lang.String signIn(java.lang.String userId, org.springframework.social.connect.Connection<?> connection, org.springframework.web.context.request.NativeWebRequest request) {
    com.example.entity.User user = userService.findByUsername(userId);
    org.springframework.security.core.Authentication authentication = com.example.util.SignInUtils.signInUser(user);
    org.springframework.security.core.context.SecurityContextHolder.getContext().setAuthentication(new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(userId, null, java.util.Arrays.asList(new org.springframework.security.core.authority.SimpleGrantedAuthority("FACEBOOK_USER"))));
    tokenBasedRememberMeServices.onLoginSuccess(((javax.servlet.http.HttpServletRequest) (request.getNativeRequest())), ((javax.servlet.http.HttpServletResponse) (request.getNativeResponse())), authentication);
    return null;
}
@org.junit.Test
public void testUnsuccessfulAuthenticatioBearer() throws java.lang.Exception {
    org.springframework.security.core.AuthenticationException exception = new org.springframework.security.authentication.BadCredentialsException("OOPS");
    this.setBearerAuthHeader(request);
    filter.unsuccessfulAuthentication(request, response, exception);
    org.mockito.Mockito.verify(failureHandler).onAuthenticationFailure(org.mockito.Mockito.any(javax.servlet.http.HttpServletRequest.class), org.mockito.Mockito.any(javax.servlet.http.HttpServletResponse.class), org.mockito.Mockito.any(org.springframework.security.core.AuthenticationException.class));
}
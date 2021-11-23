@java.lang.Override
public void onAuthenticationSuccess(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.Authentication authentication) throws java.io.IOException, javax.servlet.ServletException {
    if (((response.getContentType()) == null) || (response.getContentType().startsWith("text/"))) {
        handle(request, response, authentication);
    }else {
        response.setStatus(HttpServletResponse.SC_OK);
    }
    clearAuthenticationAttributes(request);
}
@java.lang.Override
public void onAuthenticationSuccess(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.Authentication authentication) throws java.io.IOException, javax.servlet.ServletException {
    org.json.simple.JSONObject json = new org.json.simple.JSONObject();
    json.put("username", authentication.getName());
    response.getWriter().print(json);
    clearAuthenticationAttributes(request);
}
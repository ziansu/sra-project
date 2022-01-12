@java.lang.Override
public void doFilter(com.gmail.at.ivanehreshi.epam.touragency.security.ServletRequest request, com.gmail.at.ivanehreshi.epam.touragency.security.ServletResponse response, com.gmail.at.ivanehreshi.epam.touragency.security.FilterChain chain) throws com.gmail.at.ivanehreshi.epam.touragency.security.ServletException, java.io.IOException {
    com.gmail.at.ivanehreshi.epam.touragency.security.HttpServletRequest httpRequest = new com.gmail.at.ivanehreshi.epam.touragency.security.SecuredHttpServletRequest(((com.gmail.at.ivanehreshi.epam.touragency.security.HttpServletRequest) (request)));
    com.gmail.at.ivanehreshi.epam.touragency.security.User currentUser = getCurrentUser(httpRequest);
    java.util.List<com.gmail.at.ivanehreshi.epam.touragency.security.Role> roles = (java.util.Objects.isNull(currentUser)) ? new java.util.ArrayList<>() : currentUser.getRoles();
    checkPermissions(request, response, roles);
    chain.doFilter(httpRequest, response);
}
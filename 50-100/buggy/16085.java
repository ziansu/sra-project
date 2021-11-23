private void checkPermissions(com.gmail.at.ivanehreshi.epam.touragency.security.ServletRequest request, com.gmail.at.ivanehreshi.epam.touragency.security.ServletResponse response, java.util.List<com.gmail.at.ivanehreshi.epam.touragency.security.Role> roles) throws com.gmail.at.ivanehreshi.epam.touragency.security.ServletException, java.io.IOException {
    java.lang.String extraPath = ((com.gmail.at.ivanehreshi.epam.touragency.security.HttpServletRequest) (request)).getRequestURI();
    if (!(SecurityContext.INSTANCE.allowed(extraPath, roles))) {
        request.getRequestDispatcher(SecurityContext.INSTANCE.getLoginPage()).forward(request, response);
    }
}
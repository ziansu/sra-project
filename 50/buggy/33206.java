private boolean shouldIFilter(javax.servlet.http.HttpServletRequest request) {
    return authorizedRoutes.contains(request.getServletPath());
}
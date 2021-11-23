private boolean shouldIFilter(javax.servlet.http.HttpServletRequest request) {
    java.lang.String url = request.getServletPath();
    return authorizedRoutes.contains(url);
}
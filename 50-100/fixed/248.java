private boolean shouldSkipPermissionControl(javax.servlet.http.HttpServletRequest request) {
    return (("GET".equals(request.getMethod())) || (!("true".equals(java.lang.System.getenv("enable.permission.control"))))) || (request.getPathInfo().contains("User/v1/login"));
}
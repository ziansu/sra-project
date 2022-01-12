public java.util.Map<java.lang.String, java.lang.String> getNameAndPermission(javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    try {
        java.lang.String id = request.getUserPrincipal().getName();
        return userServiceQuery.getNameAndPermissionByID(id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw e;
    }
}
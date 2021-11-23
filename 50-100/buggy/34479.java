public java.util.Map<java.lang.String, java.lang.String> getNameAndPermission(javax.servlet.http.HttpServletRequest request) {
    try {
        java.lang.String id = request.getUserPrincipal().getName();
        return this.userServiceQuery.getNameAndPermissionByID(id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw e;
    }
}
public java.util.List<java.lang.String> getPermissions() throws java.lang.Exception {
    try {
        return userServiceQuery.getPermissions();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw e;
    }
}
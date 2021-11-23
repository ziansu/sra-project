@java.lang.Override
protected java.lang.String getUserId(javax.servlet.http.HttpServletRequest request) {
    java.lang.String userId = super.getUserId(request);
    java.lang.String[] parts = userId.split(";", 2);
    if (((parts.length) == 2) && (parts[0].equals(parts[1]))) {
        return parts[0];
    }
    return userId;
}
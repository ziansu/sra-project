private java.lang.String getToken() {
    java.lang.String token = request.getHeader("Authorization");
    java.lang.String rs = null;
    if (token != null) {
        rs = token.replace("Bearer", "").trim();
    }
    return null;
}
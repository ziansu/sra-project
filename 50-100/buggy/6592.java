protected final java.lang.String getToken() {
    java.lang.String token = this.getCookie("token");
    if (token == null) {
        token = this.getHeader("token");
        if (token == null) {
            token = this.getString("token");
        }
    }
    return token;
}
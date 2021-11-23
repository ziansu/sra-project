public boolean validateToken(java.lang.String token) {
    try {
        if ((exists("csrf_token")) && (get("csrf_token").equals(token))) {
            set("csrf_token", "");
            return (token != null) && (!(token.equals("")));
        }
        return false;
    } catch (java.sql.SQLException e) {
        return false;
    }
}
public boolean validateToken(java.lang.String token) {
    try {
        return (((token != null) && (!(token.equals("")))) && (exists("csrf_token"))) && (get("csrf_token").equals(token));
    } catch (java.sql.SQLException e) {
        return false;
    }
}
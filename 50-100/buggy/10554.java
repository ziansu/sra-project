public java.lang.String addDev(objects.Device dev) {
    java.sql.PreparedStatement stmt = null;
    java.sql.Connection conn = null;
    java.lang.String sql = "INSERT INTO network " + "VALUES (?, '?', '?')";
    try {
        conn = getConnection();
    } catch (java.sql.SQLException e) {
        return new java.lang.String(e.getMessage());
    } catch (java.net.URISyntaxException e) {
        return new java.lang.String(e.getMessage());
    }
    return "MADE IT";
}
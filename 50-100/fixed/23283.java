public java.lang.String addDev(objects.Device dev) {
    java.sql.PreparedStatement stmt = null;
    java.sql.Connection conn = null;
    java.lang.String sql = "INSERT INTO network " + "VALUES (?, '?', '?')";
    try {
        conn = getConnection();
    } catch (java.sql.SQLException e) {
        return message;
    } catch (java.net.URISyntaxException e) {
        return message;
    }
    return "MADE IT";
}
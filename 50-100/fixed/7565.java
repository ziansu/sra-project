public void addToFavorites(java.lang.String name, int id) throws java.sql.SQLException {
    try (java.sql.Connection con = dataSource.getConnection()) {
        java.sql.PreparedStatement ps = con.prepareStatement("INSERT INTO favorites (name, plan_id) VALUES (?,?)");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}
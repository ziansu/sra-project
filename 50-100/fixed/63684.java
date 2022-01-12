public java.sql.ResultSet searchSchedule(java.lang.String date) throws java.sql.SQLException {
    java.sql.Connection conn = establishConnection();
    try {
        java.lang.String query = ("SELECT * FROM Schedule WHERE date LIKE\"%" + date) + "%\"";
        java.sql.PreparedStatement statement = conn.prepareStatement(query);
        java.sql.ResultSet rs = statement.executeQuery();
        return rs;
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("error. Not found.");
        return null;
    }
}
public void update(java.lang.String query) {
    try {
        java.sql.PreparedStatement statement = connection.prepareStatement(query);
        statement.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
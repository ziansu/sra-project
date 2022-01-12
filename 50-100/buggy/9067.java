public void update(java.lang.String query, boolean silence) {
    try {
        openConnection();
        java.sql.PreparedStatement statement = connection.prepareStatement(query);
        statement.execute();
    } catch (java.sql.SQLException e) {
        if (silence) {
        }else {
            e.printStackTrace();
        }
    }
    closeConnection();
}
public int getCounterFromAGBFavorite(int agbSourceId) {
    int counter = 0;
    java.lang.String sql = "SELECT `counter` FROM `agb_favorite` WHERE `agb_source_id` like ?";
    java.sql.PreparedStatement preparedStatement;
    try {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, agbSourceId);
        preparedStatement.execute();
        java.sql.ResultSet resultSet = preparedStatement.getResultSet();
        if (resultSet.next()) {
            counter = java.lang.Integer.valueOf(resultSet.getString("counter"));
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return counter;
}
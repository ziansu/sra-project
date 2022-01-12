public template.Team.player.Player map(int i, java.sql.ResultSet resultSet, org.skife.jdbi.v2.StatementContext statementContext) throws java.sql.SQLException {
    return new template.Team.player.Player(resultSet.getString("id"), resultSet.getString("number"), resultSet.getString("position"), resultSet.getBlob("avatar"), resultSet.getString("name"));
}
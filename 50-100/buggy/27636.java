protected void setInsert(domain.model.Team team) throws java.sql.SQLException {
    insert.setString(1, team.getName());
    insert.setString(2, team.getCountry());
    insert.setInt(3, team.getTeamStatistics().getId());
    java.sql.ResultSet gen = insert.getGeneratedKeys();
    if (gen.next()) {
        team.setId(gen.getInt(1));
    }
}
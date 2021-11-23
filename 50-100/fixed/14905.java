private void readProjects(model.Developer developer, java.sql.Connection connection) throws java.sql.SQLException {
    java.sql.PreparedStatement ps = connection.prepareStatement("SELECT project_id FROM projects_developers WHERE developer_id = ?");
    ps.setInt(1, developer.getId());
    java.sql.ResultSet rs = ps.executeQuery();
    java.util.List<java.lang.Integer> projectsIds = new java.util.ArrayList<>();
    while (rs.next()) {
        projectsIds.add(rs.getInt(1));
    } 
}
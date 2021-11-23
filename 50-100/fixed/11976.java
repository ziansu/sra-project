@java.lang.Override
public java.util.List<java.lang.Long> getSolutionProjects(long id) {
    java.util.List<java.lang.Long> projects = new java.util.ArrayList<>();
    java.lang.String query = "select id from project where solutionid=" + id;
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> projectsResult = jdbcTemplate.queryForList(query);
    for (java.util.Map<java.lang.String, java.lang.Object> team : projectsResult) {
        projects.add(java.lang.Long.parseLong(team.get("id").toString()));
    }
    return projects;
}
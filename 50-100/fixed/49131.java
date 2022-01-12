java.lang.String updateTeam(java.lang.String id, java.lang.String pm, java.lang.String name, java.lang.String project, java.lang.String info, java.lang.String goal) {
    java.lang.String query = (((((((((((((((("Update Teams set id = '" + id) + "',") + "pm = '") + pm) + "',") + "name = '") + name) + "',") + "project = '") + project) + "',") + "info = '") + info) + "',") + "goal = '") + goal) + "'";
    return executeSql(query);
}
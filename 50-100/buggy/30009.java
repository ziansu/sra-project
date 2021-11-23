public java.lang.String project_tech(int id) throws java.sql.SQLException {
    java.lang.String sql = "SELECT * FROM project_tech WHERE project_id = " + id;
    java.lang.String techs = "";
    java.sql.ResultSet set = query(sql);
    while (set.next()) {
        techs += "," + (set.getString("tech"));
    } 
    techs = techs.substring(1);
    return techs;
}
protected static java.util.List<com.sura.it.management.platforms.model.Department> getByParent(int id, java.sql.Connection connection) throws java.net.URISyntaxException, java.sql.SQLException {
    com.sura.it.management.platforms.model.Department department = null;
    java.util.List<com.sura.it.management.platforms.model.Department> list = new java.util.ArrayList<com.sura.it.management.platforms.model.Department>();
    java.sql.Statement stmt = connection.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery(((com.sura.it.management.platforms.dataAccess.DepartmentsDataAccess.LIST_DEPARTMENTS_BY_PARENT_ID_SQL) + (java.lang.Integer.toString(id))));
    while (rs.next()) {
        department = com.sura.it.management.platforms.dataAccess.DepartmentsDataAccess.loadObject(rs);
        list.add(department);
        break;
    } 
    return list;
}
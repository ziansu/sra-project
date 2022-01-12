public static java.util.ArrayList<be.ehb.restservermetdatabase.model.User> getUsers() {
    java.util.ArrayList<be.ehb.restservermetdatabase.model.User> result = new java.util.ArrayList<be.ehb.restservermetdatabase.model.User>();
    try {
        java.sql.ResultSet results = be.ehb.restservermetdatabase.dao.Database.execSqlAndReturn("SELECT * from users");
        while (results.next()) {
            be.ehb.restservermetdatabase.model.User current = be.ehb.restservermetdatabase.dao.UserDao.convertRowToObject(results);
            result.add(current);
        } 
    } catch (java.sql.SQLException ex) {
        ex.printStackTrace();
    }
    return result;
}
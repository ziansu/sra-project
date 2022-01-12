private java.lang.String deleteCourseFromDatabaseTicket(java.lang.String id) throws java.sql.SQLException {
    util.SqlHelper helper = new util.SqlHelper();
    java.lang.String result = "";
    java.lang.String sqlString = "DELETE FROM `course_has_ticket` WHERE `fk_course_id`=";
    sqlString += ("'" + id) + "'";
    javax.sql.rowset.CachedRowSet data = new com.sun.rowset.CachedRowSetImpl();
    result = helper.excuteSql(sqlString, data);
    data.close();
    return result;
}
private void insertNewVolunteerIntoDB(java.lang.String uname, java.lang.String pwd, java.lang.String volunteerName, java.lang.String centerId) throws java.lang.Exception {
    java.lang.String hashedPassword = getHashedPassword(pwd);
    java.lang.String insertVolunteerQuery = java.lang.String.format(MTT_CONSTANTS.INSERT_VOLUNTEER_DB_QUERY, volunteerName, uname, hashedPassword, centerId);
    java.sql.Statement query = Resources.connection.createStatement();
    query.execute(insertVolunteerQuery);
    query.close();
}
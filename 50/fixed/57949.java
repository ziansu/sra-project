private boolean registerUser(com.studybuddy.user.User user, com.studybuddy.dbmodels.DBManager dbm) {
    java.lang.String insert = com.studybuddy.dbhelpers.DBQueries.registerUser(user);
    dbm.executeNonQuery(insert);
    return true;
}
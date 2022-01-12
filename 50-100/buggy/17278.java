public boolean updateProfile(java.lang.String userName, java.lang.String major) {
    int results;
    dbConnect();
    results = edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.db.sendUpdate(java.lang.String.format(("UPDATE profile " + ("SET major = '%s' " + "WHERE UName = '%s';")), major, userName));
    closeDBComs();
    if (results == 1) {
        return true;
    }
    return false;
}
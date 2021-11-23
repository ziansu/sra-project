public boolean createProfile(java.lang.String userName, java.lang.String major) {
    int results;
    dbConnect();
    results = edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.db.sendUpdate(java.lang.String.format("INSERT INTO profile VALUES('%s','$s');", userName, major));
    edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.db.commit();
    closeDBComs();
    if (results == 1) {
        return true;
    }
    return false;
}
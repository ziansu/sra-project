public void createDatabase() throws java.io.IOException {
    boolean dbExist = checkDatabase();
    if (dbExist) {
        copyDatabase();
    }else {
        try {
            this.getReadableDatabase();
        } catch (android.database.sqlite.SQLiteException sqle) {
        }
        try {
            copyDatabase();
        } catch (java.io.IOException e) {
            throw new java.lang.Error("Error copying database");
        }
    }
}
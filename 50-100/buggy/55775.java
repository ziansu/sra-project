public void runSchemerInstall(java.lang.String path, android.content.Context ctx) throws java.io.IOException {
    if (schemerDbExists()) {
        try {
            db.execSQL(CREATE_TABLE_SCHEMES);
            db.execSQL(CREATE_TABLE_USER);
            insertSeedData(path, ",", ctx);
        } catch (android.database.SQLException e) {
            e.printStackTrace();
        }
    }
}
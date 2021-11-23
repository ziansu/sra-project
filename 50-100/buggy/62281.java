private void openDataBase() {
    try {
        com.sleepycat.je.EnvironmentConfig envConf = new com.sleepycat.je.EnvironmentConfig();
        envConf.setAllowCreate(true);
        dbEnv = new com.sleepycat.je.Environment(new java.io.File("lib/db"), envConf);
        com.sleepycat.je.DatabaseConfig dbConf = new com.sleepycat.je.DatabaseConfig();
        dbConf.setAllowCreate(true);
        mapsDB = dbEnv.openDatabase(null, "MAPS_DB", dbConf);
        java.lang.System.out.println("deu boa!");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
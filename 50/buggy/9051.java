public com.khillynn.DB getDatabase() {
    if ((database) == null) {
        database = getMongo().getDB(MongoDBD.database);
        java.lang.System.out.println(" ********* database was null");
    }
    java.lang.System.out.println(" ********** getDatabase() was called");
    return database;
}
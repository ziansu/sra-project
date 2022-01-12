public com.khillynn.Mongo getMongo() {
    if ((mongo) == null) {
        com.khillynn.MongoCredential credential = com.khillynn.MongoCredential.createCredential(MongoDBD.username, MongoDBD.database, MongoDBD.password.toCharArray());
        mongo = new com.khillynn.MongoClient(new com.khillynn.ServerAddress(MongoDBD.host, MongoDBD.port), java.util.Arrays.asList(credential));
        java.lang.System.out.println("mongo was null in getMongo()");
    }
    java.lang.System.out.println(" ********** I called getMongo()");
    return mongo;
}
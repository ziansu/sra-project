public com.mongodb.client.MongoDatabase buildMongoDatabase(java.lang.String dbName) throws java.net.UnknownHostException {
    if ((dbName == null) && (!(this.disabled))) {
        throw new com.washingtonpost.mongo.dropwizard.exceptions.NullDBNameException();
    }
    com.mongodb.MongoClient client = buildClient();
    if (client == null) {
        return null;
    }
    return client.getDatabase(dbName);
}
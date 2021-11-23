public void connect() {
    mongoClient = new com.mongodb.MongoClient("localhost", 27017);
    db = mongoClient.getDatabase("twitterdb");
}
public static void main(java.lang.String[] args) {
    com.mongodb.MongoClient mongoClient = new com.mongodb.MongoClient("localhost", 27017);
    java.lang.System.out.println("Establishing connection...");
    com.mongodb.DB db = mongoClient.getDB("crawler");
    com.mongodb.DBCollection table = db.getCollection("urlpages");
    java.lang.System.out.println("Connected to MongoDB!");
    Homework.Ranking ranker = new Homework.Ranking(db);
    ranker.link_analysis();
    ranker.TFIDF("google");
}
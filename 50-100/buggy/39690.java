public java.lang.String login(com.stories.model.User user) {
    com.mongodb.client.MongoCollection<org.bson.Document> users = db.getCollection("users");
    if ((users.find(new org.bson.Document("username", user.getUsername()).append("password", user.getPassword()))) != null) {
        return "token";
    }else {
        return null;
    }
}
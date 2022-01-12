public boolean removeUser(com.stories.model.User user) {
    com.mongodb.client.MongoCollection<org.bson.Document> users = db.getCollection("users");
    return (users.findOneAndDelete(new org.bson.Document("username", user.getUsername()).append("password", user.getPassword()))) != null;
}
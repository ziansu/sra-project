public java.lang.Double loadAccountMoney(java.lang.String name) {
    com.mongodb.DBCollection collection = getDatabase().getCollection(org.melonbrew.fe.database.databases.MongoDB.ACCOUNTS_COLLECTION);
    com.mongodb.DBObject userObject = collection.findOne(new com.mongodb.BasicDBObject("name", name));
    if (userObject == null) {
        return null;
    }
    return ((com.mongodb.BasicDBObject) (userObject)).getDouble("money");
}
public void updateDevice(org.traccar.database.mongo.Device device) throws java.sql.SQLException {
    database.getCollection(CollectionName.device).updateOne(new org.bson.Document("id", device.getId()), new org.bson.Document("$set", new org.bson.Document("name", device.getName())).append("$set", new org.bson.Document("uniqueId", device.getUniqueId())));
}
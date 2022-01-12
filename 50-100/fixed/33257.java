public void updateLocation(long userId, java.lang.String map, java.lang.Integer zoom, java.lang.Double latitude, java.lang.Double longitude) {
    database.getCollection(CollectionName.user).updateOne(new org.bson.Document("id", userId), new org.bson.Document("$set", new org.bson.Document("map", map).append("zoom", zoom).append("latitude", latitude).append("longitude", longitude)));
}
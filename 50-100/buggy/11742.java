public static java.util.List<labfinder.Room> getAllRooms() {
    com.mongodb.client.MongoCollection<org.bson.Document> classCol = labfinder.MongoAccess.db.getCollection("Rooms");
    java.util.List<org.bson.Document> all = classCol.find().into(new java.util.ArrayList<org.bson.Document>());
    java.util.List<labfinder.Room> rooms = new java.util.ArrayList<labfinder.Room>();
    for (org.bson.Document doc : all) {
        rooms.add(new labfinder.Room(doc));
    }
    return rooms;
}
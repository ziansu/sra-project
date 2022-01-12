private java.util.ArrayList<model.Artist> getArtistsCursor(com.mongodb.client.MongoCursor<org.bson.Document> cursor) {
    java.util.ArrayList<model.Artist> artists = new java.util.ArrayList<>();
    while (cursor.hasNext()) {
        org.bson.Document obj = cursor.next();
        model.Artist artist = new model.Artist(obj.getString("name"), new model.User(obj.getString("addBy")));
        artists.add(artist);
    } 
    cursor.close();
    return artists;
}
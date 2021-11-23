public void removeMessage(java.lang.String id) {
    lockCollection();
    com.mongodb.client.FindIterable<org.bson.Document> iterable = collection.find(new org.bson.Document("_id", new org.bson.types.ObjectId(id)));
    com.mongodb.client.MongoCursor<org.bson.Document> cursor = iterable.iterator();
    if (!(cursor.hasNext()))
        return ;
    
    org.bson.Document document = cursor.next();
    this.remove(((org.bson.types.ObjectId) (document.get("_id"))));
}
protected void refreshAttributesOnClose() {
    com.mongodb.BasicDBObject query = new com.mongodb.BasicDBObject("_id", new org.bson.types.ObjectId(getId()));
    dbFile = ((org.kurento.repository.internal.repoimpl.mongo.MongoRepository) (repository)).getGridFS().findOne(query);
    if ((dbFile) == null)
        throw new org.kurento.commons.exception.KurentoException(("Grid object not found for id " + (getId())));
    
    state = State.STORED;
    attributes.setContentLength(dbFile.getLength());
}
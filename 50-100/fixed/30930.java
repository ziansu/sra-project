protected void refreshAttributesOnClose() {
    dbFile = ((org.kurento.repository.internal.repoimpl.mongo.MongoRepository) (repository)).getGridFS().findOne(getId());
    if ((dbFile) == null)
        throw new org.kurento.commons.exception.KurentoException(("Grid object not found for id " + (getId())));
    
    state = State.STORED;
    attributes.setContentLength(dbFile.getLength());
}
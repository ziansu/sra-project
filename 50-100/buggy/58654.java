public java.util.UUID createRelation(nl.knaw.huygens.timbuctoo.database.dto.dataset.Collection collection, nl.knaw.huygens.timbuctoo.database.dto.CreateRelation createRelation, java.lang.String userId) throws java.io.IOException, nl.knaw.huygens.timbuctoo.security.AuthorizationException, nl.knaw.huygens.timbuctoo.security.AuthorizationUnavailableException {
    checkIfAllowedToWrite(userId, collection);
    java.util.UUID id = java.util.UUID.randomUUID();
    createRelation.setId(id);
    createRelation.setCreated(createChange(userId));
    nl.knaw.huygens.timbuctoo.database.CreateMessage createMessage = dataAccess.createRelation(collection, createRelation);
    if (!(createMessage.succeeded())) {
        throw new java.io.IOException(createMessage.getErrorMessage().get());
    }
    return id;
}
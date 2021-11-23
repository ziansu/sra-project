public void dropCollection(final java.lang.String collectionName) throws io.lumeer.engine.api.exception.CollectionNotFoundException {
    if (dataStorage.hasCollection(collectionName)) {
        linkingFacade.dropCollectionLinks(collectionName);
        dropCollectionMetadata(collectionName);
        dataStorage.dropCollection(collectionName);
        collections = null;
    }else {
        throw new io.lumeer.engine.api.exception.CollectionNotFoundException(io.lumeer.engine.util.ErrorMessageBuilder.collectionNotFoundString(collectionName));
    }
}
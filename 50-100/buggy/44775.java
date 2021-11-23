@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public eu.europeana.uim.store.MetaDataRecord<java.lang.String> createMetaDataRecord(eu.europeana.uim.store.Collection<java.lang.String> collection, java.lang.String identifier) throws eu.europeana.uim.storage.StorageEngineException {
    collection = ((eu.europeana.uim.store.Collection<java.lang.String>) (ensureConsistency(collection)));
    eu.europeana.uim.store.mongo.decorators.MongoMetadataRecordDecorator<java.lang.String> mdr = new eu.europeana.uim.store.mongo.decorators.MongoMetadataRecordDecorator<java.lang.String>(((eu.europeana.uim.store.mongo.decorators.MongoCollectionDecorator<java.lang.String>) (collection)), identifier);
    return mdr;
}
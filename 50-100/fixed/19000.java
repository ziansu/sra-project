@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public eu.europeana.uim.store.Request<java.lang.String> createRequest(java.util.Collection<java.lang.String> collection, java.util.Date date) throws eu.europeana.uim.storage.StorageEngineException {
    collection = ((java.util.Collection<java.lang.String>) (ensureConsistency(collection)));
    eu.europeana.uim.store.mongo.decorators.MongoRequestDecorator<java.lang.String> r = new eu.europeana.uim.store.mongo.decorators.MongoRequestDecorator<java.lang.String>(((eu.europeana.uim.store.mongo.decorators.MongoCollectionDecorator<java.lang.String>) (collection)), date);
    ds.save(r);
    return r.getEmbeddedRequest();
}
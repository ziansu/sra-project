@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<eu.europeana.uim.store.Collection<java.lang.String>> getCollections(eu.europeana.uim.store.Provider<java.lang.String> provider) {
    provider = ((eu.europeana.uim.store.Provider<java.lang.String>) (ensureConsistency(provider)));
    java.util.List<eu.europeana.uim.store.Collection<java.lang.String>> res = new java.util.ArrayList<eu.europeana.uim.store.Collection<java.lang.String>>();
    for (eu.europeana.uim.store.mongo.decorators.MongoCollectionDecorator<java.lang.String> c : ds.find(eu.europeana.uim.store.mongo.decorators.MongoCollectionDecorator.class).filter("provider", provider).asList()) {
        res.add(c.getEmbeddedCollection());
    }
    return res;
}
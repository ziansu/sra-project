@java.lang.Override
public java.util.List<java.util.Collection<java.lang.String>> getAllCollections() {
    java.util.List<java.util.Collection<java.lang.String>> res = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
    for (eu.europeana.uim.store.mongo.decorators.MongoCollectionDecorator<java.lang.String> c : ds.find(eu.europeana.uim.store.mongo.decorators.MongoCollectionDecorator.class).asList()) {
        res.add(c.getEmbeddedCollection());
    }
    return res;
}
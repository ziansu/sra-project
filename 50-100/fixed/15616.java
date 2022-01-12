@java.lang.Override
public void put(java.lang.Object key, java.lang.Object value) {
    com.orientechnologies.orient.core.index.OCompositeKey compositeKey = ((com.orientechnologies.orient.core.index.OCompositeKey) (key));
    if (key instanceof com.orientechnologies.orient.core.index.OCompositeKey) {
    }
    java.util.Set<com.orientechnologies.orient.core.db.record.OIdentifiable> container = ((java.util.Set<com.orientechnologies.orient.core.db.record.OIdentifiable>) (value));
    for (com.orientechnologies.orient.core.db.record.OIdentifiable oIdentifiable : container) {
        addDocument(newGeoDocument(oIdentifiable, factory.makeShape(compositeKey, ctx)));
    }
}
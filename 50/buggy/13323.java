@java.lang.Override
public int getTotalByCollection(eu.europeana.uim.store.Collection<java.lang.String> collection) {
    java.lang.String[] recs = getByCollection(collection);
    return recs.length;
}
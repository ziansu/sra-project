@java.lang.Override
public int getTotalByCollection(java.util.Collection<java.lang.String> collection) {
    java.lang.String[] recs = getByCollection(collection);
    return recs.length;
}
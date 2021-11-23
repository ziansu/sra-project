public static <T> java.util.Collection<java.lang.Long> keysToIds(java.util.Collection<com.googlecode.objectify.Key<T>> keys) {
    java.util.List<java.lang.Long> collection = new java.util.ArrayList<java.lang.Long>();
    for (com.googlecode.objectify.Key<T> key : keys) {
        collection.add(java.lang.Long.valueOf(key.getId()));
    }
    return collection;
}
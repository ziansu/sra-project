public static java.lang.String serializeObjectCollectionToString(java.util.Collection<? extends java.lang.Object> collection) {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    java.util.Iterator iterator = collection.iterator();
    while (iterator.hasNext()) {
        stringBuilder.append(iterator.next());
        stringBuilder.append(java.lang.String.format("%n"));
    } 
    return stringBuilder.toString();
}
public static boolean isMultiValue(final java.lang.Class<?> iType) {
    return ((((com.orientechnologies.common.collection.OCollection.class.isAssignableFrom(iType)) || (java.util.Collection.class.isAssignableFrom(iType))) || (iType.isArray())) || (java.util.Map.class.isAssignableFrom(iType))) || (com.orientechnologies.common.collection.OMultiCollectionIterator.class.isAssignableFrom(iType));
}
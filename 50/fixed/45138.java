@java.lang.SuppressWarnings(value = "RedundantTypeArguments")
private static <T> java.util.Iterator<T> flatten(java.util.Iterator<java.lang.Iterable<T>> iterator) {
    return com.google.common.collect.Iterators.concat(com.google.common.collect.Iterators.transform(iterator, java.lang.Iterable<T>::iterator));
}
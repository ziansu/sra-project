public static <T> net.coljate.list.impl.MutableWrappedArrayList<T> copyOf(final net.coljate.collection.Collection<? extends T> collection) {
    return net.coljate.list.impl.MutableWrappedArrayList.viewOf(collection.mutableJavaCopy(java.util.ArrayList::new));
}
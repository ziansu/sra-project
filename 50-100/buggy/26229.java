public static <O, T> java.util.List<T> collect(final java.util.Iterator<O> inputIterator, final org.apache.commons.collections4.Transformer<? super O, ? extends T> transformer) {
    return null == inputIterator ? java.util.Collections.<T>emptyList() : ((java.util.List<T>) (org.apache.commons.collections4.CollectionUtils.collect(inputIterator, transformer)));
}
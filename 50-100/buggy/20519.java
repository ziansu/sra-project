public static <O, T> java.util.List<T> collect(final java.lang.Iterable<O> inputIterable, final org.apache.commons.collections4.Transformer<? super O, ? extends T> transformer) {
    return null == inputIterable ? java.util.Collections.<T>emptyList() : ((java.util.List<T>) (org.apache.commons.collections4.CollectionUtils.collect(inputIterable, transformer)));
}
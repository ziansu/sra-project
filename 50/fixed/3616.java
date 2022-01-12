public static <T> ciir.jfoley.chai.collections.TopKHeap<T> minItems(int minSize, java.util.Comparator<? super T> cmp) {
    return new ciir.jfoley.chai.collections.TopKHeap<>(minSize, cmp.reversed());
}
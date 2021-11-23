public <V extends java.lang.Comparable<? super V>> T minBy(org.eclipse.collections.api.block.function.Function<? super T, ? extends V> function) {
    return this.delegate.asReversed().minBy(function);
}
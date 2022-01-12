public static <T> java.util.stream.Stream<T> iterate(T seed, java.util.function.UnaryOperator<T> f) {
    return java.util.stream.StreamSupport.stream(new java.util.Spliterators.AbstractSpliterator<T>(java.lang.Long.MAX_VALUE, java.util.Spliterator.ORDERED) {
        private T next = seed;

        @java.lang.Override
        public boolean tryAdvance(java.util.function.Consumer<? super T> action) {
            action.accept(next);
            next = f.apply(next);
            return true;
        }
    }, false);
}
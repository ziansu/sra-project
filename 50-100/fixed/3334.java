public static <T> com.annimon.stream.Stream<T> of(final java.util.List<? extends T> list) {
    return new com.annimon.stream.Stream<T>(new java.util.Iterator<T>() {
        private int index = 0;

        @java.lang.Override
        public boolean hasNext() {
            return (index) < (list.size());
        }

        @java.lang.Override
        public T next() {
            return list.get(((index)++));
        }
    });
}
public static <T> com.annimon.stream.Stream<T> of(final T... array) {
    return new com.annimon.stream.Stream<T>(new java.util.Iterator<T>() {
        private int index = 0;

        @java.lang.Override
        public boolean hasNext() {
            return (index) < (array.length);
        }

        @java.lang.Override
        public T next() {
            return array[((index)++)];
        }
    });
}
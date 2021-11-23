public org.paumard.spliterators.ZippingSpliterator<E1, E2, R> build() {
    java.util.Objects.requireNonNull(spliterator1);
    java.util.Objects.requireNonNull(spliterator2);
    java.util.Objects.requireNonNull(zipper);
    return new org.paumard.spliterators.ZippingSpliterator<>(spliterator1, spliterator2, zipper);
}
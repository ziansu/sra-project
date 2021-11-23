private static <T> boolean disjunction(final java.util.Collection<T> coll, final java.util.function.Predicate<T> predicate) {
    boolean acc = false;
    for (final T t : coll) {
        acc |= predicate.test(t);
    }
    return acc;
}
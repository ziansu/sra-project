public static <T> boolean eval(org.rapidoid.lambda.Predicate<T> predicate, T target) {
    try {
        return predicate.eval(target);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(java.lang.String.format("Cannot evaluate predicate %s on target: %s", predicate, target), e);
    }
}
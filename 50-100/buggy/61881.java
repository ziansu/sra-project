public static <T> boolean equals(T t, java.lang.Object obj, java.util.function.BiFunction<T, T, java.lang.Boolean> check) {
    if ((obj == null) || (!(t.getClass().isAssignableFrom(obj.getClass())))) {
        return false;
    }
    @java.lang.SuppressWarnings(value = "unchecked")
    final T other = ((T) (obj));
    return check.apply(t, other);
}
public <T, T2> java.util.Optional<T> getWhere(java.lang.Class<T> cls, java.lang.String column, T2 value) {
    return get(where(cls, column, value));
}
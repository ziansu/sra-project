@java.lang.Override
public <T> T unwrap(java.lang.Class<T> clazz) {
    if (mgnlCache.getClass().isAssignableFrom(clazz)) {
        return ((T) (mgnlCache));
    }
    throw new java.lang.IllegalArgumentException();
}
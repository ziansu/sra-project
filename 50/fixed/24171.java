@java.lang.Override
public <T> T unwrap(java.lang.Class<T> clazz) {
    if (clazz.isAssignableFrom(mgnlCache.getClass())) {
        return ((T) (mgnlCache));
    }
    throw new java.lang.IllegalArgumentException();
}
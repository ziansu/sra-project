public T get(final C instance) {
    if ((mField) == null)
        return mFallbackValue;
    
    try {
        @java.lang.SuppressWarnings(value = "unchecked")
        final T value = ((T) (mField.get(instance)));
        return value;
    } catch (final java.lang.IllegalAccessException e) {
        return null;
    }
}
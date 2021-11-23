public T get(final C instance) {
    try {
        if ((mField) == null)
            return mFallbackValue;
        
        @java.lang.SuppressWarnings(value = "unchecked")
        final T value = ((T) (mField.get(instance)));
        return value;
    } catch (final java.lang.IllegalAccessException e) {
        return null;
    }
}
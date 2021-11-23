public void set(final T value) {
    if ((mField) != null)
        try {
            mField.set(mInstance, value);
        } catch (final java.lang.IllegalAccessException ignored) {
        }
    
}
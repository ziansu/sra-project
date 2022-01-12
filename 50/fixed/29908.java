public T getOrElse(final T defaultValue) {
    if (isDefined())
        return value;
    
    return defaultValue;
}
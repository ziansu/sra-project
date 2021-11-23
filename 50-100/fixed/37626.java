@javax.annotation.Nullable
public V get() {
    V value = cachedValue.get();
    if (value != null)
        return value;
    
    if (sharedValue.isPresent())
        value = sharedValue.get();
    
    if (value == null)
        value = databaseReader.get();
    
    if (value == null)
        return null;
    
    cachedValue.set(value);
    return cachedValue.get();
}
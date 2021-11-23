@javax.annotation.Nullable
public V get() {
    if (!(isPresent())) {
        V value = null;
        if (sharedValue.isPresent())
            value = sharedValue.get();
        
        if (value == null)
            value = databaseReader.get();
        
        if (value == null)
            return null;
        
        cachedValue.set(value);
    }
    return cachedValue.get();
}
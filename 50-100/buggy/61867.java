@java.lang.Override
public java.lang.Void process(java.util.Map.Entry<K, V> entry) {
    V currentObjects = entry.getValue();
    if (currentObjects != null) {
        for (T objectToRemove : objectsToRemove) {
            currentObjects.remove(objectToRemove);
        }
    }
    if (!(currentObjects instanceof com.kryptnostic.rhizome.hazelcast.objects.SetProxy<?, ?>)) {
        entry.setValue(currentObjects);
    }
    if (currentObjects.isEmpty()) {
        entry.setValue(null);
    }
    return null;
}
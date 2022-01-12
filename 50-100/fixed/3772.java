@java.lang.Override
protected java.io.ObjectStreamClass readClassDescriptor() throws java.io.IOException, java.lang.ClassNotFoundException {
    int key = readInt();
    java.io.ObjectStreamClass objectStreamClass = readLookupLocalCache.get(key);
    if (objectStreamClass != null) {
        return objectStreamClass;
    }
    objectStreamClass = readLookup.get(key);
    java.io.ObjectStreamClass discOsc = org.ehcache.impl.serialization.CompactJavaSerializer.disconnect(objectStreamClass);
    readLookupLocalCache.put(key, discOsc);
    writeLookup.putIfAbsent(new org.ehcache.impl.serialization.CompactJavaSerializer.SerializableDataKey(discOsc, true), key);
    return objectStreamClass;
}
@java.lang.Override
public boolean containsKey(java.lang.Object key) {
    if (key == null) {
        throw new java.lang.NullPointerException("key");
    }
    if ((root) == null) {
        return false;
    }
    @java.lang.SuppressWarnings(value = "unchecked")
    V notFound = ((V) (io.coronet.pico.PMapImpl.NOT_FOUND));
    return (root.get(key.hashCode(), 0, key, notFound)) != (io.coronet.pico.PMapImpl.NOT_FOUND);
}
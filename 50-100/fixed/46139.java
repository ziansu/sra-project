@java.lang.Override
public boolean containsKey(java.lang.Object key) throws java.lang.NullPointerException {
    if (isEmpty())
        return false;
    
    int hashCode = hashValue(key);
    java.util.Iterator iterator = hashArray[hashCode].iterator();
    while (iterator.hasNext()) {
        com.timneville.Maps.HashMapImpMap.MapEntry<K, V> currentEntry = ((com.timneville.Maps.HashMapImpMap.MapEntry<K, V>) (iterator.next()));
        if (currentEntry.getKey().equals(key)) {
            return true;
        }
    } 
    return false;
}
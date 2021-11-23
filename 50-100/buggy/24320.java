@java.lang.Override
public V remove(K key) {
    int hashedKey = hashingFunction(key);
    java.util.List<com.jwetherell.algorithms.data_structures.HashMap.Pair<K, V>> list = array[hashedKey];
    for (com.jwetherell.algorithms.data_structures.HashMap.Pair<K, V> pair : list) {
        if (pair.key.equals(key)) {
            list.remove(pair);
            (size)--;
            return pair.value;
        }
    }
    return null;
}
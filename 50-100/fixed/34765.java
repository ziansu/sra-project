@java.lang.Override
public java.util.Set<K> keySet() {
    java.util.Set<K> result = new java.util.HashSet<K>(count);
    for (int i = 0; i < (table.length); i++) {
        if ((table[i]) != null) {
            for (com.killeent.Dictionary.HashDictionary.Entry<K, V> entry : table[i]) {
                result.add(entry.key);
            }
        }
    }
    return java.util.Collections.unmodifiableSet(result);
}
public boolean containsValue(V value) {
    for (org.nau.HashtableEntry<K, V> entry : table) {
        return entry == null ? false : (value == null) && ((entry.getValue()) == null) ? true : (value == null) || ((entry.getValue()) == null) ? false : value.equals(entry.getValue());
    }
    return false;
}
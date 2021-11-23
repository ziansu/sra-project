public boolean containsValue(V value) {
    for (org.nau.HashtableEntry<K, V> entry : table) {
        if ((((value != null) && (entry != null)) && ((entry.getValue()) != null)) && (value.equals(entry.getValue()))) {
            return true;
        }
    }
    return false;
}
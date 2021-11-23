public boolean containsValues(V value) {
    for (java.util.List<V> vals : values()) {
        if (((vals.size()) == 1) && (vals.contains(value))) {
            return true;
        }
    }
    return false;
}
public boolean containsValues(V value) {
    for (java.util.List<V> vals : values()) {
        if (((vals.size()) > 0) && (vals.contains(value))) {
            return true;
        }
    }
    return false;
}
private java.util.Map<K, V> getView() {
    java.util.Map<K, V> result = view;
    if (result == null) {
        result = java.util.Collections.unmodifiableMap(core);
        view = result;
    }
    return result;
}
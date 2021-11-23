public boolean putIfAbsent(K sym, V v) {
    if (map.containsKey(sym)) {
        return false;
    }
    map.put(sym, v);
    return true;
}
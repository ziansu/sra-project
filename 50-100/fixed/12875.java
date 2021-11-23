public int findIndexFromKey(K key) {
    for (int i = 0; i < (internalMap.size()); i++) {
        if (internalMap.get(i).getKey().equals(key))
            return i;
        
    }
    return -1;
}
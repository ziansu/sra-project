public boolean replaceKey(int index, K oldKey, V value, K newKey) {
    return this.subMap.replaceKey(index, oldKey, value, newKey);
}
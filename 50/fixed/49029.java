public boolean replace(int index, K oldKey, K newKey) {
    return this.subMap.replaceKey(index, oldKey, newKey);
}
@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
private void resize() {
    lock14.datastrcutures.HashTable.HashNode[] newHashTable = new lock14.datastrcutures.HashTable.HashNode[(hashTable.length) + ((hashTable.length) / 2)];
    lock14.datastrcutures.HashTable.HashNode[] oldHashTable = hashTable;
    hashTable = newHashTable;
    for (lock14.datastrcutures.HashTable.HashNode<K, V> current : oldHashTable) {
        while (current != null) {
            put(current.key, current.value);
            current = current.next;
        } 
    }
}
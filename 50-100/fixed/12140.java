public boolean containsKey(java.lang.Object key) {
    int pos = getHash(key);
    if ((table[pos]) == null) {
        return false;
    }else {
        hashtable.HashTable.Node curr = table[pos];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return true;
            }
            curr = curr.next;
        } 
        return false;
    }
}
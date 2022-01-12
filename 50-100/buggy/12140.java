public boolean containsKey(java.lang.Object key) {
    int pos = getHash(key);
    if ((table[pos]) == null) {
        return false;
    }else {
        hashtable.HashTable.Node curr = table[pos];
        while (true) {
            if (curr.key.equals(key)) {
                return true;
            }
            if ((curr.next) == null) {
                break;
            }
            curr = curr.next;
        } 
        return false;
    }
}
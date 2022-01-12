public datastructure.HashEntry get(java.lang.Object Key) {
    int hash = getHash(Key.hashCode());
    int bucketnumber = getBucketNumber(hash);
    datastructure.HashEntry current = table[bucketnumber];
    while ((current.next) != null) {
        if (current.getKey().equals(Key)) {
            return current;
        }
        current = current.next;
    } 
    return null;
}
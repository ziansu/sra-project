private int findAvailableRoomForEntry(K key) {
    org.nau.NAUHashtable.HashCodeToProbe hashCodeToProbe = new org.nau.NAUHashtable.HashCodeToProbe(key.hashCode());
    while ((hashCodeToProbe.getH()) < (table.length)) {
        final int index = calcIndexByHashcode(hashCodeToProbe.getHashcode());
        org.nau.HashtableEntry<K, V> element = table[index];
        if (element == null)
            return index;
        
        java.lang.System.out.println("The room is reserved. Probing the next room...");
        hashCodeToProbe = hashCodeToProbe.next();
    } 
    return -1;
}
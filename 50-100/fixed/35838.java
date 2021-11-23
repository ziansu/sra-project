private int findAvailableRoomForEntry(K key) {
    for (org.nau.NAUHashtable.HashCodeToProbe hashCodeToProbe = new org.nau.NAUHashtable.HashCodeToProbe(key.hashCode()); (hashCodeToProbe.getH()) < (table.length); hashCodeToProbe = hashCodeToProbe.next()) {
        final int index = calcIndexByHashcode(hashCodeToProbe.getHashcode());
        org.nau.HashtableEntry<K, V> element = table[index];
        if (element == null)
            return index;
        
        java.lang.System.out.println("The room is reserved. Probing the next room...");
    }
    return -1;
}
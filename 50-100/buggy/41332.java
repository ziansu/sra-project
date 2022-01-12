private int getNextInRing(int direction) {
    int peers = (remotePeerHashMap.size()) + 1;
    int index = getID();
    for (int i = 0; i < (remotePeerHashMap.size()); i++) {
        index = (index + direction) % peers;
        if (remotePeerHashMap.containsKey(index))
            return index;
        
    }
    java.lang.System.err.println("getNextInRing(): no other peers in the ring");
    return -1;
}
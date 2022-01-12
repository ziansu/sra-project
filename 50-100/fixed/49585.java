public ChordMessageInterface closestPrecedingNode(long key) throws java.rmi.RemoteException {
    for (int x = 0; x <= ((Chord.M) - 1); x++) {
        if ((finger[x]) != null) {
            if (isKeyInSemiCloseInterval(key, this.getId(), finger[x].getId())) {
                return finger[x];
            }
        }
    }
    return successor;
}
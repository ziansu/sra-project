public synchronized kostiskag.unitynetwork.tracker.runData.BlueNodeEntry getBlueNodeEntryByPhAddrPort(java.lang.String Phaddress, int port) {
    java.util.Iterator<kostiskag.unitynetwork.tracker.runData.BlueNodeEntry> iterator = list.listIterator();
    while (iterator.hasNext()) {
        kostiskag.unitynetwork.tracker.runData.BlueNodeEntry bn = iterator.next();
        if ((bn.getPhaddress().equals(Phaddress)) && ((bn.getPort()) == port)) {
            return bn;
        }
    } 
    return null;
}
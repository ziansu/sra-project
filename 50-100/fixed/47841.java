public unife.icedroid.core.NeighborInfo getNeighborByID(java.lang.String ID) {
    synchronized(neighborsList) {
        for (unife.icedroid.core.NeighborInfo n : neighborsList) {
            if (n.getHostID().equals(ID)) {
                return n;
            }
        }
        unife.icedroid.core.NeighborInfo n = new unife.icedroid.core.NeighborInfo(ID, null, null, new java.util.ArrayList<>(), new java.util.ArrayList<>());
        return n;
    }
}
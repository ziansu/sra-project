public boolean isFull(int i, int j) {
    if (!(isOpen(i, j)))
        return false;
    
    int currentSiteIndex = gridToArrayIndex(i, j);
    java.lang.System.out.println(((((("Checking if site [" + i) + ",") + j) + "] is full with index ") + currentSiteIndex));
    return wquf.connected(1, currentSiteIndex);
}
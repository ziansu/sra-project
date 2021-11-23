public synchronized void destroy() {
    if ((containingGrid) != null) {
        org.jtrfp.trcl.SpacePartitioningGrid g = getContainingGrid();
        if (g != null)
            if ((lastContainingList) != null)
                synchronized(lastContainingList) {
                    lastContainingList.remove(this);
                }
            
        
    }
    containingGrid = null;
    final double[] pos = getPosition();
    setActive(false);
    pos[0] = java.lang.Double.NEGATIVE_INFINITY;
    pos[1] = java.lang.Double.NEGATIVE_INFINITY;
    pos[2] = java.lang.Double.NEGATIVE_INFINITY;
    notifyPositionChange();
}
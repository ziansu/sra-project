public void addTrapRefsForTrap(java.util.ArrayList<java.awt.Point> locationsThatRefToOrigin, java.awt.Point originTrap) {
    if (locationsThatRefToOrigin != null) {
        for (java.awt.Point locOnGrid : locationsThatRefToOrigin) {
            this.getTile(locOnGrid.x, locOnGrid.y).addTrapRef(originTrap);
        }
    }
}
private static void notifyChange() {
    if ((interactors.LocationProxyRule.gid2location) != null) {
        synchronized(interactors.LocationProxyRule.gid2location) {
            interactors.LocationProxyRule.gid2location = null;
        }
    }
    if ((interactors.LocationProxyRule.roots) != null) {
        synchronized(interactors.LocationProxyRule.roots) {
            interactors.LocationProxyRule.roots = null;
        }
    }
    if ((interactors.LocationProxyRule.uniqueSortedLocationNames) != null) {
        synchronized(interactors.LocationProxyRule.uniqueSortedLocationNames) {
            interactors.LocationProxyRule.uniqueSortedLocationNames = null;
        }
    }
}
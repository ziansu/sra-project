public boolean getRouteForNewBicycleType(android.location.Location loc) {
    if (recalculationInProgress) {
        return false;
    }
    lastRecalcLocation = loc;
    recalculationInProgress = true;
    android.location.Location end = getEndLocation();
    if ((loc == null) || (end == null)) {
        return false;
    }
    new com.spoiledmilk.ibikecph.map.SMHttpRequest().getRecalculatedRoute(loc, end, null, null, null, null, this);
    return true;
}
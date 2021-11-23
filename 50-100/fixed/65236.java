public static int encodeLocation(team006.MapLocation rcLoc, team006.MapLocation targetLoc) {
    int diffX = (targetLoc.x) - (rcLoc.x);
    int diffY = (targetLoc.y) - (rcLoc.y);
    int locSignal = (100 * (java.lang.Math.abs(diffX))) + (java.lang.Math.abs(diffY));
    locSignal += (diffX < 0) ? 1000 : 0;
    locSignal += (diffY < 0) ? 10 : 0;
    return locSignal;
}
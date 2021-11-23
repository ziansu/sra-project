private static java.lang.Double calculatePriority(java.lang.Double tentativeG, java.lang.Double lon, java.lang.Double lat, java.lang.Double endLon, java.lang.Double endLat) {
    java.lang.Double lonDiff = lon - endLon;
    java.lang.Double latDiff = lat - endLat;
    java.lang.Double distanceBetweenNodes = java.lang.Math.sqrt(((lonDiff * lonDiff) + (latDiff * latDiff)));
    return tentativeG + distanceBetweenNodes;
}
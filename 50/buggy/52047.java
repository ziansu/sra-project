public boolean isOnPath(org.geogebra.common.kernel.kernelND.GeoPointND P, double eps) {
    setChangingPoint(P);
    org.geogebra.common.kernel.MyPoint closestPoint = getClosestPoint();
    if (closestPoint != null) {
        return (java.lang.Math.sqrt(closestPointDist)) < eps;
    }
    return false;
}
public final java.lang.StringBuilder toStringLHS() {
    double[] g = new double[3];
    if (isDefined()) {
        g[0] = x;
        g[1] = y;
        g[2] = z;
        return kernel.buildLHS(g, geogebra.common.kernel.geos.GeoLine.vars, geogebra.common.kernel.geos.GeoLine.KEEP_LEADING_SIGN, true);
    }else
        return geogebra.common.kernel.geos.GeoLine.sbToStringLHS;
    
}
private void setName(org.geogebra.common.kernel.discrete.PolygonTriangulation.Point point, java.lang.String s, int i) {
    if (org.geogebra.common.kernel.discrete.PolygonTriangulation.DEBUG) {
        if (s == null) {
            setName(point, i);
        }else {
            point.name = s + i;
        }
    }
}
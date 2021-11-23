public static int D(com.vividsolutions.jts.geom.Geometry geom) {
    com.vividsolutions.jts.geom.CoordinateSequenceFactory f = geom.getFactory().getCoordinateSequenceFactory();
    if (f instanceof org.geotools.data.oracle.sdo.CoordinateAccessFactory) {
        return ((org.geotools.data.oracle.sdo.CoordinateAccessFactory) (f)).getDimension();
    }else
        if (geom.isEmpty()) {
            return 2;
        }else {
            return java.lang.Double.isNaN(geom.getCoordinate().z) ? 2 : 3;
        }
    
}
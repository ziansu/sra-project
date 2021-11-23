public nz.co.gregs.dbvolution.datatypes.spatial3D.PointZ transformDatabasePoint3DValueToPointZ(java.lang.String pointAsString) throws java.text.ParseException {
    final nz.co.gregs.dbvolution.datatypes.spatial3D.GeometryFactory3D geometryFactory = new nz.co.gregs.dbvolution.datatypes.spatial3D.GeometryFactory3D();
    nz.co.gregs.dbvolution.datatypes.spatial3D.PointZ point = geometryFactory.createPointZ(new com.vividsolutions.jts.geom.Coordinate(0, 0, 0));
    com.vividsolutions.jts.io.WKTReader wktReader = new com.vividsolutions.jts.io.WKTReader();
    com.vividsolutions.jts.geom.Geometry geometry = wktReader.read(pointAsString);
    if (geometry instanceof com.vividsolutions.jts.geom.Point) {
        point = geometryFactory.createPointZ(((com.vividsolutions.jts.geom.Point) (geometry)));
    }else {
        throw new nz.co.gregs.dbvolution.exceptions.IncorrectGeometryReturnedForDatatype(geometry, geometry.getCentroid());
    }
    return point;
}
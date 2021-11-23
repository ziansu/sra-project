public static com.vividsolutions.jts.geom.Geometry singleSideBuffer(com.vividsolutions.jts.geom.Geometry geometry, double distance) {
    return org.h2gis.functions.spatial.buffer.ST_SideBuffer.computeSingleSideBuffer(geometry, distance, new com.vividsolutions.jts.operation.buffer.BufferParameters());
}
private java.util.List<com.vividsolutions.jts.geom.Coordinate> makeExpectedCoordinates(double... points) {
    java.util.List<com.vividsolutions.jts.geom.Coordinate> result = new java.util.ArrayList<com.vividsolutions.jts.geom.Coordinate>(points.length);
    double x = -1;
    for (double d : points) {
        if (x == (-1)) {
            x = d;
        }else {
            com.vividsolutions.jts.geom.Coordinate coordinate = new com.vividsolutions.jts.geom.Coordinate(d, x);
            x = -1;
            result.add(coordinate);
        }
    }
    return result;
}
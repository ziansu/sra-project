@org.junit.Test
public void testTwoSubpolygons() throws com.vividsolutions.jts.io.ParseException {
    java.lang.String wkt = "MULTIPOLYGON (((0 0, 2 10, 10 20, 20 20, 20 0, 0 0)),((0 40, 2 50, 10 60, 20 60, 20 40, 0 40)))";
    com.vividsolutions.jts.io.WKTReader wktReader = new com.vividsolutions.jts.io.WKTReader();
    com.vividsolutions.jts.geom.Geometry geometry = wktReader.read(wkt);
    org.codice.alliance.libs.klv.GeometryReducer reducer = new org.codice.alliance.libs.klv.GeometryReducer();
    com.vividsolutions.jts.geom.Geometry actual = reducer.apply(geometry);
    com.vividsolutions.jts.geom.Geometry expected = wktReader.read(wkt);
    org.junit.Assert.assertThat(actual, org.hamcrest.Matchers.is(expected));
}
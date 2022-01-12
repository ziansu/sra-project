@org.junit.Test
public void testSingleSubpolygon() throws com.vividsolutions.jts.io.ParseException {
    java.lang.String wkt = "POLYGON ((0 0, 0 10, 10 10, 10 0, 0 0))";
    com.vividsolutions.jts.io.WKTReader wktReader = new com.vividsolutions.jts.io.WKTReader();
    com.vividsolutions.jts.geom.Geometry geometry = wktReader.read(wkt);
    org.codice.alliance.libs.klv.GeometryReducer reducer = new org.codice.alliance.libs.klv.GeometryReducer();
    com.vividsolutions.jts.geom.Geometry actual = reducer.apply(geometry, context);
    org.junit.Assert.assertThat(actual, org.hamcrest.Matchers.is(geometry));
}
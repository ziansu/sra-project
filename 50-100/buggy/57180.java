@org.junit.Test
public void testEmptySubpolygon() throws com.vividsolutions.jts.io.ParseException {
    com.vividsolutions.jts.geom.Geometry geometry = org.codice.alliance.libs.klv.GeometryReducerTest.GEOMETRY_FACTORY.createMultiPolygon(null);
    org.codice.alliance.libs.klv.GeometryReducer reducer = new org.codice.alliance.libs.klv.GeometryReducer();
    com.vividsolutions.jts.geom.Geometry actual = reducer.apply(geometry);
    org.junit.Assert.assertThat(actual.isEmpty(), org.hamcrest.Matchers.is(true));
}
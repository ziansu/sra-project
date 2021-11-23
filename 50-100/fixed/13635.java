public void testAgainstSlowVersion() {
    for (int i = 0; i < 100000; i++) {
        double lat1 = org.apache.lucene.geo.GeoTestUtil.nextLatitude();
        double lon1 = org.apache.lucene.geo.GeoTestUtil.nextLongitude();
        double lat2 = org.apache.lucene.geo.GeoTestUtil.nextLatitude();
        double lon2 = org.apache.lucene.geo.GeoTestUtil.nextLongitude();
        double expected = org.apache.lucene.util.TestSloppyMath.slowHaversin(lat1, lon1, lat2, lon2);
        double actual = org.apache.lucene.util.SloppyMath.haversinMeters(lat1, lon1, lat2, lon2);
        assertEquals(expected, actual, org.apache.lucene.util.TestSloppyMath.HAVERSIN_DELTA);
    }
}
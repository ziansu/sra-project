@org.junit.Test
public void testDeg2Utm() {
    cgeo.geocaching.location.UTMConverter.UTM utm = conv.latLon2UTM(lat, lon);
    org.junit.Assert.assertEquals(easting, utm.getEasting(), 1.1);
    org.junit.Assert.assertEquals(northing, utm.getNorthing(), 1.1);
    org.junit.Assert.assertEquals(zone, java.lang.Integer.parseInt(utm.getLongZone()));
    org.junit.Assert.assertEquals(zoneCm, utm.getLatZone());
}
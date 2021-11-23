public static final java.lang.String stringEncode(final double lon, final double lat, final int level) {
    final long ghLong = org.elasticsearch.common.geo.GeoHashUtils.fromMorton(org.apache.lucene.spatial.geopoint.document.GeoPointField.encodeLatLon(lat, lon), level);
    return org.elasticsearch.common.geo.GeoHashUtils.stringEncode(ghLong);
}
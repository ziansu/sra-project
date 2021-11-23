public org.elasticsearch.common.geo.GeoPoint resetFromGeoHash(java.lang.String geohash) {
    final long hash = org.elasticsearch.common.geo.GeoHashUtils.mortonEncode(geohash);
    return this.reset(org.apache.lucene.spatial.geopoint.document.GeoPointField.decodeLatitude(hash), org.apache.lucene.spatial.geopoint.document.GeoPointField.decodeLongitude(hash));
}
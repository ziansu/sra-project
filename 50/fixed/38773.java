public org.elasticsearch.common.geo.GeoPoint resetFromGeoHash(java.lang.String geohash) {
    final long hash = org.elasticsearch.common.geo.GeoHashUtils.mortonEncode(geohash);
    return this.reset(org.elasticsearch.common.geo.GeoHashUtils.decodeLatitude(hash), org.elasticsearch.common.geo.GeoHashUtils.decodeLongitude(hash));
}
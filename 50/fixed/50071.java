@java.lang.Override
public org.elasticsearch.common.geo.GeoPoint get(int index) {
    final org.elasticsearch.common.geo.GeoPoint point = values[index];
    return new org.elasticsearch.common.geo.GeoPoint(point.lat(), point.lon());
}
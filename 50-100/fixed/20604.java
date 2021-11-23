@java.lang.Override
public org.dsa.iot.historian.utils.QueryData queryLast(java.lang.String path) {
    final org.dsa.iot.historian.utils.QueryData data = new org.dsa.iot.historian.utils.QueryData();
    if ((db) == null) {
        return null;
    }
    db.query(path, java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE, 1, true, new org.etsdb.QueryCallback<org.dsa.iot.etsdb.serializer.ByteData>() {
        @java.lang.Override
        public void sample(java.lang.String seriesId, long ts, org.dsa.iot.etsdb.serializer.ByteData b) {
            data.setTimestamp(ts);
            data.setValue(b.getValue());
        }
    });
    return data;
}
@java.lang.Override
public void query(java.lang.String path, long from, long to, final org.dsa.iot.dslink.util.handler.CompleteHandler<org.dsa.iot.historian.utils.QueryData> handler) {
    db.query(path, from, to, new org.etsdb.QueryCallback<org.dsa.iot.etsdb.serializer.ByteData>() {
        @java.lang.Override
        public void sample(java.lang.String seriesId, long ts, org.dsa.iot.etsdb.serializer.ByteData data) {
            handler.handle(data);
        }
    });
    handler.complete();
}
private static javax.jcr.Repository createRepository(org.apache.jackrabbit.oak.plugins.document.util.MongoConnection connection) {
    org.apache.jackrabbit.oak.plugins.document.DocumentNodeStore store = new org.apache.jackrabbit.oak.plugins.document.DocumentMK.Builder().memoryCacheSize(((64 * 1024) * 1024)).setPersistentCache("target/persistentCache,time").setMongoDB(connection.getDB()).getNodeStore();
    org.apache.jackrabbit.oak.query.QueryEngineSettings qs = new org.apache.jackrabbit.oak.query.QueryEngineSettings();
    qs.setFullTextComparisonWithoutIndex(true);
    return new org.apache.jackrabbit.oak.jcr.Jcr(store).with(qs).createRepository();
}
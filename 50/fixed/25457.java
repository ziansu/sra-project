public static void close(final com.marklogic.client.DatabaseClient client) {
    if (null != client) {
        client.release();
        org.sanju.ml.ConnectionManager.clientMap.remove(org.sanju.ml.ConnectionManager.name(client));
    }
}
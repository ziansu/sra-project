@org.junit.AfterClass
public static void closeCassandra() {
    if ((org.apache.flink.streaming.connectors.cassandra.CassandraConnectorITCase.session) != null) {
        org.apache.flink.streaming.connectors.cassandra.CassandraConnectorITCase.session.close();
    }
    if ((org.apache.flink.streaming.connectors.cassandra.CassandraConnectorITCase.cluster) != null) {
        org.apache.flink.streaming.connectors.cassandra.CassandraConnectorITCase.cluster.close();
    }
    if (org.apache.flink.streaming.connectors.cassandra.CassandraConnectorITCase.EMBEDDED) {
        if ((org.apache.flink.streaming.connectors.cassandra.CassandraConnectorITCase.cassandra) != null) {
            try {
                org.apache.flink.streaming.connectors.cassandra.CassandraConnectorITCase.cassandra.destroy();
            } catch (java.lang.IllegalStateException ignored) {
            }
        }
    }
}
public void testSimpleClient() {
    org.elasticsearch.client.Client client = getClient();
    org.elasticsearch.action.admin.cluster.health.ClusterHealthResponse health = client.admin().cluster().prepareHealth().setWaitForYellowStatus().get();
    java.lang.String clusterName = health.getClusterName();
    int numberOfNodes = health.getNumberOfNodes();
    assertThat((("cluster [" + clusterName) + "] should have at least 1 node"), numberOfNodes, org.hamcrest.Matchers.greaterThan(0));
}
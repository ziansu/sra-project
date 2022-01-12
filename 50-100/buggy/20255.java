public static boolean connectElasticSearch() throws edu.berkeley.ground.exceptions.GroundException {
    java.lang.System.out.println("CONNECTING TO ELASTIC SEARCH");
    try {
        edu.berkeley.ground.util.ElasticSearch.node = org.elasticsearch.node.NodeBuilder.nodeBuilder().clusterName(edu.berkeley.ground.util.ElasticSearch.clusterName).node();
        edu.berkeley.ground.util.ElasticSearch.client = edu.berkeley.ground.util.ElasticSearch.node.client();
    } catch (java.lang.Exception e) {
        throw new edu.berkeley.ground.exceptions.GroundException("ElasticSearch encountered an error while trying to connect");
    }
    return !(edu.berkeley.ground.util.ElasticSearch.node.isClosed());
}
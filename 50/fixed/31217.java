public static void closeElasticSearch() {
    edu.berkeley.ground.util.ElasticSearch.node.close();
    edu.berkeley.ground.util.ElasticSearch.client.close();
}
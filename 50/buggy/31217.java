public static void closeElasticSearch() {
    java.lang.System.out.println("CLOSING ELASTIC SEARCH!");
    edu.berkeley.ground.util.ElasticSearch.node.close();
    edu.berkeley.ground.util.ElasticSearch.client.close();
}
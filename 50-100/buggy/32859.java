public static java.lang.String getBaseURL(org.apache.solr.client.solrj.SolrServer solrServer) {
    org.apache.solr.client.solrj.impl.HttpSolrServer httpSolrServer = (solrServer instanceof org.apache.solr.client.solrj.impl.HttpSolrServer) ? ((org.apache.solr.client.solrj.impl.HttpSolrServer) (solrServer)) : org.mousephenotype.cda.solr.SolrUtils.getHttpSolrServer(solrServer);
    if (httpSolrServer != null) {
        java.lang.System.out.println(("got server: " + (httpSolrServer.getBaseURL())));
        return httpSolrServer.getBaseURL();
    }
    return "";
}
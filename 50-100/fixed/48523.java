protected org.apache.solr.client.solrj.SolrServer initService() {
    if ((tw.edu.ncu.im.Util.EmbeddedIndexSearcher.SolrHomePath) == null) {
        throw new java.lang.IllegalStateException("Please set the home path of Solr Location");
    }
    if ((tw.edu.ncu.im.Util.EmbeddedIndexSearcher.solrCoreName) == null) {
        throw new java.lang.IllegalStateException("Please set the solr core name");
    }
    org.apache.solr.core.CoreContainer container = new org.apache.solr.core.CoreContainer(tw.edu.ncu.im.Util.EmbeddedIndexSearcher.SolrHomePath);
    container.load();
    java.lang.System.out.println(container.getCoreNames());
    org.apache.solr.client.solrj.embedded.EmbeddedSolrServer embeddedService = new org.apache.solr.client.solrj.embedded.EmbeddedSolrServer(container, tw.edu.ncu.im.Util.EmbeddedIndexSearcher.solrCoreName);
    java.lang.System.out.println("Solr System conntected!");
    return embeddedService;
}
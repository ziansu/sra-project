@javax.annotation.PostConstruct
public void init() {
    if (((solrClient) == null) && ((solrUrl) != null)) {
        java.lang.String url = solrUrl;
        if (url.startsWith(org.schedoscope.metascope.index.SolrFacade.SOLR_HTTP_PREFIX)) {
            initSolrFacade(new org.apache.solr.client.solrj.impl.HttpSolrClient(url));
        }else {
            org.apache.solr.core.CoreContainer coreContainer = new org.apache.solr.core.CoreContainer(url);
            coreContainer.load();
            initSolrFacade(new org.apache.solr.client.solrj.embedded.EmbeddedSolrServer(coreContainer, org.schedoscope.metascope.index.SolrFacade.METASCOPE_CORE));
        }
    }
}
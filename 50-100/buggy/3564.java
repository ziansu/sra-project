private org.apache.solr.client.solrj.SolrServer getBestSolrServer(java.lang.String operation) {
    if ((this.cloudSolrServer) != null) {
        return this.cloudSolrServer;
    }else
        if (operation == (SolrConstants.OPERATION_INSERT_STREAMING)) {
            return this.concSolrServer;
        }else {
            return this.httpServer;
        }
    
}
@org.junit.Test
public void testMultiTermsCombinedSearch() {
    try {
        org.apache.solr.client.solrj.SolrServer service = new tw.edu.ncu.im.Util.EmbeddedIndexSearcher().getService();
        java.lang.String[] multiTerm = new java.lang.String[]{ "Google" , "Yahoo" };
        long num = this.searcher.searchMultipleTerm(multiTerm);
        java.lang.System.out.println(num);
        assertThat(num, not(equalTo(((long) (0)))));
        assertNotNull(service);
    } catch (org.apache.solr.client.solrj.SolrServerException e) {
        e.printStackTrace();
    }
}
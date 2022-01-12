@org.junit.Before
@java.lang.Override
public void setUp() throws java.lang.Exception {
    super.setUp();
    instance = new org.apache.solr.security.BasicAuthStandaloneTest.SolrInstance("inst", null);
    instance.setUp();
    jetty = createJetty(instance);
    initCore("solrconfig.xml", "schema.xml", instance.getHomeDir().toString());
    securityConfHandler = new org.apache.solr.handler.admin.SecurityConfHandlerLocalForTesting(jetty.getCoreContainer());
}
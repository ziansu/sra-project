@org.junit.Test
public void testReadFeed() throws java.lang.Exception {
    final org.apache.camel.component.olingo2.Olingo2AppAPITest.TestOlingo2ResponseHandler<org.apache.olingo.odata2.api.ep.feed.ODataFeed> responseHandler = new org.apache.camel.component.olingo2.Olingo2AppAPITest.TestOlingo2ResponseHandler<org.apache.olingo.odata2.api.ep.feed.ODataFeed>();
    org.apache.camel.component.olingo2.Olingo2AppAPITest.olingoApp.read(org.apache.camel.component.olingo2.Olingo2AppAPITest.edm, org.apache.camel.component.olingo2.Olingo2AppAPITest.MANUFACTURERS, null, null, responseHandler);
    final org.apache.olingo.odata2.api.ep.feed.ODataFeed dataFeed = responseHandler.await();
    org.junit.Assert.assertNotNull("Data feed", dataFeed);
    org.apache.camel.component.olingo2.Olingo2AppAPITest.LOG.info("Entries:  {}", org.apache.camel.component.olingo2.Olingo2AppAPITest.prettyPrint(dataFeed));
}
@org.junit.Test(expected = org.codice.ddf.endpoints.rest.ServerErrorException.class)
public void testAddDocumentNullMessage() {
    ddf.catalog.CatalogFramework framework = org.mockito.Mockito.mock(ddf.catalog.CatalogFramework.class);
    org.codice.ddf.endpoints.rest.RESTEndpoint rest = new org.codice.ddf.endpoints.rest.RESTEndpoint(framework);
    javax.ws.rs.core.HttpHeaders headers = org.mockito.Mockito.mock(javax.ws.rs.core.HttpHeaders.class);
    rest.addDocument(headers, org.mockito.Mockito.mock(javax.ws.rs.core.UriInfo.class), org.mockito.Mockito.mock(javax.servlet.http.HttpServletRequest.class), org.mockito.Mockito.mock(org.apache.cxf.jaxrs.ext.multipart.MultipartBody.class), null);
}
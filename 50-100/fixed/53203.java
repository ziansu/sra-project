@org.testng.annotations.Test
public void should_set_report_uri() {
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.BatchThumbnailAdapter thumbnailAdapter = new com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.BatchThumbnailAdapter(sessionStorageMock);
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.BatchThumbnailAdapter retrieved = thumbnailAdapter.report("/public/Samples/Reports/07g.RevenueDetailReport");
    javax.ws.rs.core.MultivaluedHashMap<java.lang.String, java.lang.String> params = ((javax.ws.rs.core.MultivaluedHashMap<java.lang.String, java.lang.String>) (org.mockito.internal.util.reflection.Whitebox.getInternalState(retrieved, "params")));
    java.util.List<java.lang.String> list = params.get("uri");
    org.testng.Assert.assertSame(retrieved, thumbnailAdapter);
    org.testng.Assert.assertEquals(list.get(0), "/public/Samples/Reports/07g.RevenueDetailReport");
}
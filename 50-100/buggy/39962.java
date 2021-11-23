@org.testng.annotations.Test
public void should_set_thumbnails_parameter() {
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.SingleThumbnailAdapter thumbnailAdapter = new com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.SingleThumbnailAdapter(sessionStorageMock);
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.SingleThumbnailAdapter retrieved = thumbnailAdapter.defaultAllowed(true);
    javax.ws.rs.core.MultivaluedHashMap<java.lang.String, java.lang.String> params = ((javax.ws.rs.core.MultivaluedHashMap<java.lang.String, java.lang.String>) (org.mockito.internal.util.reflection.Whitebox.getInternalState(thumbnailAdapter, "params")));
    java.util.List<java.lang.String> list = params.get("defaultAllowed");
    org.testng.Assert.assertSame(retrieved, thumbnailAdapter);
    org.testng.Assert.assertEquals(list.get(0), java.lang.Boolean.TRUE.toString());
}
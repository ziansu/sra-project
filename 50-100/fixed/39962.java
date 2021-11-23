@org.testng.annotations.Test
public void should_set_thumbnails_parameter() {
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.SingleThumbnailAdapter thumbnailAdapter = new com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.SingleThumbnailAdapter(sessionStorageMock);
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.thumbnails.SingleThumbnailAdapter retrieved = thumbnailAdapter.defaultAllowed(true);
    java.lang.Boolean param = ((java.lang.Boolean) (org.mockito.internal.util.reflection.Whitebox.getInternalState(retrieved, "defaultAllowed")));
    org.testng.Assert.assertSame(retrieved, thumbnailAdapter);
    org.testng.Assert.assertEquals(param, java.lang.Boolean.TRUE);
}
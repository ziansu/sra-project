@java.lang.Override
protected void checkContentDisposition(org.jclouds.blobstore.domain.Blob blob, java.lang.String contentDisposition) {
    assert (blob.getPayload().getContentMetadata().getContentDisposition()) == null;
    assert (blob.getMetadata().getContentMetadata().getContentDisposition()) == null;
}
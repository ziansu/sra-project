private org.apache.commons.io.output.DeferredFileOutputStream writeRequestBodyToOutputStream(final org.jboss.resteasy.client.jaxrs.internal.ClientInvocation request) throws java.io.IOException {
    org.apache.commons.io.output.DeferredFileOutputStream memoryManagedOutStream = new org.apache.commons.io.output.DeferredFileOutputStream(((this.fileUploadInMemoryThresholdLimit) * (getMemoryUnitMultiplier())), getTempfilePrefix(), ".tmp", null);
    request.getDelegatingOutputStream().setDelegate(memoryManagedOutStream);
    request.writeRequestBody(request.getEntityStream());
    memoryManagedOutStream.close();
    return memoryManagedOutStream;
}
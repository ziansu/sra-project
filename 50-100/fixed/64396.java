public java.nio.ByteBuffer getPartByteBuffer(java.lang.String index) {
    javax.mail.BodyPart part = getPart(index);
    if (part != null) {
        try {
            java.io.InputStream stream = part.getInputStream();
            return getByteBufferFromStream(stream);
        } catch (java.lang.Exception e) {
            org.apache.ofbiz.base.util.Debug.logError(e, org.apache.ofbiz.service.mail.MimeMessageWrapper.module);
            return null;
        }
    }
    return null;
}
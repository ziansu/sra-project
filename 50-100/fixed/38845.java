private static org.bouncycastle.cms.CMSTypedStream getSignedInputStream(javax.mail.BodyPart bodyPart, java.lang.String defaultContentTransferEncoding, java.io.File backingFile) throws javax.mail.MessagingException {
    try {
        java.io.OutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(backingFile));
        org.bouncycastle.mail.smime.SMIMEUtil.outputBodyPart(out, true, bodyPart, defaultContentTransferEncoding);
        out.close();
        java.io.InputStream in = new org.bouncycastle.mail.smime.SMIMESignedParser.TemporaryFileInputStream(backingFile);
        return new org.bouncycastle.cms.CMSTypedStream(in);
    } catch (java.io.IOException e) {
        throw new javax.mail.MessagingException(("can't extract input stream: " + e));
    }
}
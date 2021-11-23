public void write(java.io.OutputStream out) throws java.io.IOException, org.bouncycastle.cms.CMSException {
    try {
        org.bouncycastle.mail.smime.SMIMEUtil.outputBodyPart(out, bodyPart, defaultContentTransferEncoding);
    } catch (javax.mail.MessagingException e) {
        throw new org.bouncycastle.cms.CMSException(("can't write BodyPart to stream: " + e), e);
    }
}
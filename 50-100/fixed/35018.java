public int getSubPartCount(int index) {
    javax.mail.BodyPart part = getPart(java.lang.Integer.toString(index));
    try {
        java.lang.Object content = part.getContent();
        if (content instanceof javax.mail.Multipart) {
            return ((javax.mail.Multipart) (content)).getCount();
        }
        return 0;
    } catch (java.lang.Exception e) {
        org.apache.ofbiz.base.util.Debug.logError(e, org.apache.ofbiz.service.mail.MimeMessageWrapper.module);
        return -1;
    }
}
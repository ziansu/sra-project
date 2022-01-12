public java.lang.String getPartFilename(java.lang.String index) {
    javax.mail.BodyPart part = getPart(index);
    if (part != null) {
        try {
            return part.getFileName();
        } catch (javax.mail.MessagingException e) {
            org.apache.ofbiz.base.util.Debug.logError(e, org.apache.ofbiz.service.mail.MimeMessageWrapper.module);
            return null;
        }
    }else {
        return null;
    }
}
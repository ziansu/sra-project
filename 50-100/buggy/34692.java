public java.lang.String getPartRawText(java.lang.String index) {
    javax.mail.BodyPart part = getPart(index);
    if (part != null) {
        try {
            return getTextFromStream(part.getInputStream());
        } catch (java.lang.Exception e) {
            org.apache.ofbiz.base.util.Debug.logError(e, org.apache.ofbiz.service.mail.MimeMessageWrapper.module);
            return null;
        }
    }else {
        return null;
    }
}
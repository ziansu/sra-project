private static void getTitleAuthorSubject(com.adobe.xmp.impl.VeraPDFMeta metadata, java.util.Map<java.lang.String, java.lang.Object> properties) throws com.adobe.xmp.XMPException {
    org.verapdf.model.tools.XMPChecker.putProperty(properties, org.verapdf.model.tools.XMPChecker.TITLE, metadata.getTitle());
    org.verapdf.model.tools.XMPChecker.putProperty(properties, org.verapdf.model.tools.XMPChecker.SUBJECT, metadata.getDescription());
    final java.util.List<java.lang.String> buffer = metadata.getCreator();
    if (buffer != null) {
        org.verapdf.model.tools.XMPChecker.putProperty(properties, org.verapdf.model.tools.XMPChecker.AUTHOR, buffer.toArray(new java.lang.String[buffer.size()]));
    }
}
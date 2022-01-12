protected com.ximpleware.VTDNav getVTDXmlDocument(java.io.InputStream is, org.opennms.protocols.xml.config.Request request) throws java.lang.Exception {
    is = preProcessHtml(request, is);
    is = applyXsltTransformation(request, is);
    com.ximpleware.VTDGen vg = new com.ximpleware.VTDGen();
    vg.setDoc(org.apache.commons.io.IOUtils.toByteArray(is));
    vg.parse(true);
    final com.ximpleware.VTDNav nav = vg.getNav();
    return nav;
}
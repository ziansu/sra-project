private org.exist.dom.persistent.DocumentImpl extractHtmlEntry(java.util.zip.ZipInputStream zis, java.util.zip.ZipEntry zipEntry) throws org.exist.xquery.XPathException {
    try {
        return org.exist.xquery.modules.ModuleUtils.htmlToXHtml(context, new javax.xml.transform.stream.StreamSource(zis), null, null);
    } catch (org.xml.sax.SAXException saxe) {
        throw new org.exist.xquery.XPathException(saxe.getMessage(), saxe);
    } catch (java.io.IOException ioe) {
        throw new org.exist.xquery.XPathException(ioe.getMessage(), ioe);
    }
}
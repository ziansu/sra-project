private org.exist.dom.persistent.DocumentImpl extractHtmlEntry(final java.util.zip.ZipInputStream zis) throws org.exist.xquery.XPathException {
    try {
        return org.exist.xquery.modules.ModuleUtils.htmlToXHtml(context, new javax.xml.transform.stream.StreamSource(zis), null, null);
    } catch (org.xml.sax.SAXException | java.io.IOException saxe) {
        throw new org.exist.xquery.XPathException(this, saxe.getMessage(), saxe);
    }
}
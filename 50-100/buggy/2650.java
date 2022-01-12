public byte[] render(java.lang.String html) throws com.itextpdf.text.DocumentException, java.io.IOException, java.net.URISyntaxException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    org.xhtmlrenderer.pdf.ITextRenderer renderer = provider.getRenderer();
    renderer.setDocumentFromString(wrapHtml5Document(html), resourcesPath);
    renderer.layout();
    renderer.createPDF(baos, true);
    renderer.finishPDF();
    return baos.toByteArray();
}
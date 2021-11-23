private java.lang.Object htmlToPdf(java.lang.String html) throws com.itextpdf.text.DocumentException, java.io.IOException {
    java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream();
    org.w3c.dom.Document document = new org.w3c.dom.Document();
    com.itextpdf.text.pdf.PdfWriter pdfWriter = com.itextpdf.text.pdf.PdfWriter.getInstance(document, outStream);
    document.open();
    com.itextpdf.text.FontFactory.register("/fonts/Calibri.ttf");
    java.io.InputStream stream = new java.io.ByteArrayInputStream(html.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    com.itextpdf.tool.xml.XMLWorkerHelper.getInstance().parseXHtml(pdfWriter, document, stream, java.nio.charset.StandardCharsets.UTF_8);
    document.close();
    return outStream.toByteArray();
}
private static org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile createEmbeddedFile(org.apache.pdfbox.pdmodel.PDDocument doc, java.io.InputStream zugferdFile) throws java.io.IOException {
    java.util.Calendar now = java.util.Calendar.getInstance();
    io.konik.carriage.utils.ByteCountingInputStream countingIs = new io.konik.carriage.utils.ByteCountingInputStream(zugferdFile);
    org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile embeddedFile = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(doc, countingIs);
    embeddedFile.addCompression();
    embeddedFile.setSubtype(io.konik.carriage.pdfbox.PDFBoxInvoiceAppender.MIME_TYPE);
    embeddedFile.setSize(countingIs.getByteCount());
    embeddedFile.setCreationDate(now);
    embeddedFile.setModDate(now);
    return embeddedFile;
}
public static java.lang.String openPDF(java.lang.String source) throws java.io.IOException {
    com.itextpdf.kernel.pdf.PdfDocument uploadeddocument = new com.itextpdf.kernel.pdf.PdfDocument(new com.itextpdf.kernel.pdf.PdfReader(source));
    application.PdfDocumentcreation.myDocument = new com.itextpdf.kernel.pdf.PdfDocument(new com.itextpdf.kernel.pdf.PdfWriter(application.PdfDocumentcreation.tempdest));
    int noofpages = uploadeddocument.getNumberOfPages();
    uploadeddocument.copyPagesTo(1, noofpages, application.PdfDocumentcreation.myDocument);
    uploadeddocument.close();
    return application.PdfDocumentcreation.tempdest;
}
public com.itextpdf.kernel.pdf.PdfCatalog setCollection(com.itextpdf.kernel.pdf.collection.PdfCollection collection) {
    getPdfObject().put(PdfName.Collection, collection.getPdfObject());
    return this;
}
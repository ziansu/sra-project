public com.itextpdf.kernel.geom.Rectangle getCropBox() {
    initParentPages();
    com.itextpdf.kernel.pdf.PdfArray cropBox = getPdfObject().getAsArray(PdfName.CropBox);
    if (cropBox == null) {
        cropBox = ((com.itextpdf.kernel.pdf.PdfArray) (getParentValue(parentPages, PdfName.CropBox)));
        if (cropBox == null) {
            return getMediaBox();
        }
    }
    return cropBox.toRectangle();
}